package hackerrank.algorithms.recursions

import java.util.*
import kotlin.math.max
import kotlin.math.min

/**
 * 4 bQ
 * 3
 * 2   wN
 * 1   wQ
 *   A B C D
 */

const val EMPTY = "  "
val map = mapOf('A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, '1' to 3, '2' to 2, '3' to 1, '4' to 0)
val right = (1 to 0)
val left = (-1 to 0)
val down = (0 to 1)
val up = (0 to -1)
val up_right = (1 to -1)
val down_right = (1 to 1)
val up_left = (-1 to -1)
val down_left = (-1 to 1)

typealias Pos = Pair<Int, Int>
typealias Board = Array<Array<String>>

data class Piece(val pos: Pos, val type: Char, val color: Char) {
    fun makeMove(move: Pos): Piece = this.copy(pos = move)
}

var maxDepth: Int = 0

fun simplifiedChessEngine(whites: Array<Array<Char>>, blacks: Array<Array<Char>>, moves: Int): String {
    maxDepth = moves
    val wh = createPieces(whites, 'w')
    val bl = createPieces(blacks, 'b')

    return if (alphaBeta(0, Int.MIN_VALUE, Int.MAX_VALUE, 'w', wh, bl) == -2) "YES" else "NO"
}

fun alphaBeta(
    depth: Int,
    alpha: Int,
    beta: Int,
    player: Char,
    whitePieces: List<Piece>,
    blackPieces: List<Piece>
): Int {
    if (depth > maxDepth) return -1
    if (player == 'w') {
        if (isGameOver(whitePieces)) return -1
        val board = createTransitionBoard(whitePieces + blackPieces)
        printBoard(board)
        var best = Integer.MAX_VALUE
        var newBeta = beta
        for (piece in whitePieces) {
            val moves = availableMoves(piece, board)
            val wp = whitePieces.toMutableList()
            val bp = blackPieces.toMutableList()
            var flag = false
            wp.remove(piece)
            for (move in moves) {
                var removedPiece: Piece? = null

                if (board[move.second][move.first] != EMPTY) {
                    removedPiece = Piece(move, board[move.second][move.first][1], 'b')
                    bp.remove(removedPiece)
                }
                val newPiece = piece.makeMove(move)
                wp.add(newPiece)
                val value = alphaBeta(depth + 1, alpha, newBeta, 'b', wp, bp)

                best = min(best, value)
                newBeta = min(beta, best)
                if (newBeta <= alpha) {
                    flag = true
                    break
                }
                wp.remove(newPiece)
                if (removedPiece != null) bp.add(removedPiece)
            }
            if (flag) break
        }
        return best
    } else {
        if (isGameOver(blackPieces)) return -2
        var best = Integer.MIN_VALUE
        var newAlpha = alpha
        for (piece in blackPieces) {
            val board = createTransitionBoard(whitePieces + blackPieces)
            printBoard(board)
            val moves = availableMoves(piece, board)
            val wp = whitePieces.toMutableList()
            val bp = blackPieces.toMutableList()
            var flag = false
            bp.remove(piece)
            for (move in moves) {
                var removedPiece: Piece? = null

                if (board[move.second][move.first] != EMPTY) {
                    removedPiece = Piece(move, board[move.second][move.first][1], 'w')
                    wp.remove(removedPiece)
                }

                val newPiece = piece.makeMove(move)
                bp.add(newPiece)
                val value = alphaBeta(depth + 1, newAlpha, beta, 'w', wp, bp)

                best = max(best, value)
                newAlpha = max(best, alpha)
                if (beta <= newAlpha) {
                    flag = true
                    break
                }

                bp.remove(newPiece)
                if (removedPiece != null) wp.add(removedPiece)
            }
            if (flag) break
        }
        return best
    }
}

fun createTransitionBoard(pieces: List<Piece>): Board {
    val transitionBoard = Array(4) { Array(4) { EMPTY } }
    for (piece in pieces)
        transitionBoard[piece.pos.second][piece.pos.first] = "${piece.color}${piece.type}"
    return transitionBoard
}

fun isGameOver(pieces: List<Piece>): Boolean = !pieces.map { it.type }.contains('Q')

fun availableMoves(piece: Piece, board: Board) =
    when (piece.type) {
        'N' -> knightMoves(piece.pos, board)
        'Q' -> queenMoves(piece.pos, board)
        'B' -> bishopMoves(piece.pos, board)
        'R' -> rookMoves(piece.pos, board)
        else -> error("Invalid Piece")
    }

fun queenMoves(pos: Pair<Int, Int>, board: Board) =
    findAvailableMoves(arrayOf(up, down, left, right, up_left, up_right, down_left, down_right), pos, board)

fun knightMoves(pos: Pos, board: Board) =
    findAvailableMoves(
        arrayOf(
            1 to 2,
            1 to -2,
            -1 to 2,
            -1 to -2,
            2 to 1,
            2 to -1,
            -2 to 1,
            -2 to -1
        ), pos, board
    )

fun rookMoves(pos: Pos, board: Board) = findAvailableMoves(arrayOf(up, down, left, right), pos, board)

fun bishopMoves(pos: Pos, board: Board) =
    findAvailableMoves(arrayOf(up_left, up_right, down_left, down_right), pos, board)

fun findAvailableMoves(moves: Array<Pos>, pos: Pos, board: Board): List<Pos> {
    val mutableList = mutableListOf<Pos>()
    for (move in moves) {
        var spaceIsAvailable = true
        var currentSpot = pos
        while (spaceIsAvailable) {
            val x = currentSpot.first + move.first
            val y = currentSpot.second + move.second
            if ((x > -1 && x < 4)
                && (y > -1 && y < 4)
                && (board[y][x] == EMPTY
                        || isOpponentPiece(board[y][x], pos, board))
            )
                mutableList.add(x to y)
            else
                spaceIsAvailable = false
            currentSpot = x to y
        }
    }
    return mutableList
}

fun isOpponentPiece(s: String, pos: Pos, board: Board): Boolean =
    s.substring(0..0) != board[pos.second][pos.first].substring(0..0)

fun printBoard(board: Board) {
    println("*****************")
    board.forEach {
        println(it.contentToString())
    }
    println("*****************")
}

fun createPieces(pieces: Array<Array<Char>>, color: Char): List<Piece> {
    val mutableList = mutableListOf<Piece>()
    for (x in pieces)
        mutableList.add(Piece(map.getValue(x[1]) to map.getValue(x[2]), x[0], color))

    return mutableList
}

fun main() {

    val scan = Scanner(System.`in`)
    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val wbm = scan.nextLine().split(" ")
        val w = wbm[0].trim().toInt()
        val b = wbm[1].trim().toInt()
        val m = wbm[2].trim().toInt()
        val whites = Array(w) { Array(3) { 0.toChar() } }

        for (whitesRowItr in 0 until w) {
            whites[whitesRowItr] = scan.nextLine().split(" ").map { it[0] }.toTypedArray()
        }

        val blacks = Array(b) { Array(3) { 0.toChar() } }

        for (blacksRowItr in 0 until b) {
            blacks[blacksRowItr] = scan.nextLine().split(" ").map { it[0] }.toTypedArray()
        }

        println(simplifiedChessEngine(whites, blacks, m))
    }
}
