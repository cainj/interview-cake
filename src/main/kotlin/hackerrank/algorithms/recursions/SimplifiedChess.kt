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
val board = Array(4) { Array<String>(4) { EMPTY } }
val map = mapOf('A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, '1' to 3, '2' to 2, '3' to 1, '4' to 0)
val right = (1 to 0)
val left = (-1 to 0)
val down = (0 to 1)
val up = (0 to -1)
val up_right = (1 to -1)
val down_right = (1 to 1)
val up_left = (-1 to -1)
val down_left = (-1 to 1)

var maxEval = 0
var minEval = 0

typealias Pos = Pair<Int, Int>
typealias Piece = Char

data class Move(val piece: Pos, val move: Pos) {
    fun makeMove() {
        board[move.second][move.first] = board[piece.second][piece.first]
        board[piece.second][piece.first] = "  "
    }
}

fun simplifiedChessEngine(whites: Array<Array<Piece>>, blacks: Array<Array<Piece>>, moves: Int): String {
    placePieces(whites, 'w')
    placePieces(blacks, 'b')
    printBoard()
    val availableMoves = findPieces('w').flatMap { availableMoves(it) }
    //println(availableMoves)
    //println(findPieces('b').flatMap { availableMoves(it) })
    println(minimax(moves, 'w'))
    return ""
}

fun minimax(depth: Int, player: Char): Int {
    var solution = 0
    printBoard()
    if (depth == 0 || isGameOver(player))
        return 0
    val availableMoves = findPieces(player).flatMap { availableMoves(it) }
    if (player == 'w') {
        for (move in availableMoves) {
            move.makeMove()
            maxEval = Integer.MIN_VALUE
            val eval = minimax(depth - 1, 'b')
            maxEval = max(eval, maxEval)
        }
        return maxEval
    } else {
        for (move in availableMoves) {
            minEval = Integer.MIN_VALUE
            val eval = minimax(depth - 1, 'w')
            minEval = min(eval, minEval)
        }
        return minEval
    }
}

fun isGameOver(player: Char): Boolean {
    val pieces = findPieces(player)
    return !pieces.map { it.second }.contains('Q')
}

fun findPieces(player: Char): List<Pair<Pos, Piece>> {
    val pieces = mutableListOf<Pair<Pos, Piece>>()
    for (row in board.indices)
        for (column in board[row].indices)
            if (board[row][column] != EMPTY && board[row][column].startsWith(player)) {
                pieces.add((column to row) to board[row][column][1])
            }

    return pieces
}


fun availableMoves(pair: Pair<Pos, Piece>) =
    when (pair.second) {
        'N' -> knightMoves(pair.first)
        'Q' -> queenMoves(pair.first)
        'B' -> bishopMoves(pair.first)
        'R' -> rookMoves(pair.first)
        else -> error("Invalid Piece")
    }

fun queenMoves(pos: Pair<Int, Int>) =
    findAvailableMoves(arrayOf(up, down, left, right, up_left, up_right, down_left, down_right), pos)

fun knightMoves(pos: Pos) =
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
        ), pos
    )

fun rookMoves(pos: Pos) = findAvailableMoves(arrayOf(up, down, left, right), pos)

fun bishopMoves(pos: Pos) = findAvailableMoves(arrayOf(up_left, up_right, down_left, down_right), pos)

fun findAvailableMoves(moves: Array<Pos>, pos: Pos): List<Move> {
    val mutableList = mutableListOf<Move>()
    for (move in moves) {
        var spaceIsAvailable = true
        var currentSpot = pos
        while (spaceIsAvailable) {
            val x = currentSpot.first + move.first
            val y = currentSpot.second + move.second
            if ((x > -1 && x < 4) && (y > -1 && y < 4) && (board[y][x] == EMPTY || isOpponentPiece(board[y][x], pos)))
                mutableList.add(Move(piece = pos, move = x to y))
            else
                spaceIsAvailable = false
            currentSpot = x to y
        }
    }
    return mutableList
}

fun isOpponentPiece(s: String, pos: Pos): Boolean =
    s.substring(0..0) != board[pos.second][pos.first].substring(0..0)

fun printBoard() {
    println("*****************")
    board.forEach {
        println(it.contentToString())
    }
    println("*****************")
}

fun placePieces(pieces: Array<Array<Char>>, color: Char) {
    for (x in pieces)
        board[map[x[2]] ?: error("Error")][map[x[1]] ?: error("Error")] = "$color${x[0]}"
}

fun main() {

    val scan = Scanner(System.`in`)
    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val wbm = scan.nextLine().split(" ")
        val w = wbm[0].trim().toInt()
        val b = wbm[1].trim().toInt()
        val m = wbm[2].trim().toInt()
        val whites = Array(w) { Array<Char>(3) { 0.toChar() } }

        for (whitesRowItr in 0 until w) {
            whites[whitesRowItr] = scan.nextLine().split(" ").map { it[0] }.toTypedArray()
        }

        val blacks = Array(b) { Array(3) { 0.toChar() } }

        for (blacksRowItr in 0 until b) {
            blacks[blacksRowItr] = scan.nextLine().split(" ").map { it[0] }.toTypedArray()
        }

        simplifiedChessEngine(whites, blacks, m)
    }
}
