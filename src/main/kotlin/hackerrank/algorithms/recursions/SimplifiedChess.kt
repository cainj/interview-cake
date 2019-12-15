package hackerrank.algorithms.recursions

import java.util.*

/**
 * 4 0
 * 3 1
 * 2 2  N
 * 1 3
 *   A B C D
 */
val board = Array(4) { CharArray(4) { ' ' } }
val map = mapOf('A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, '1' to 3, '2' to 2, '3' to 1, '4' to 0)
val pieces = charArrayOf('Q', 'N', 'R', 'B')
val right = (1 to 0)
val left = (-1 to 0)
val down = (0 to 1)
val up = (0 to -1)
val up_right = (1 to -1)
val down_right = (1 to 1)
val up_left = (-1 to -1)
val down_left = (-1 to 1)

typealias Pos = Pair<Int, Int>
typealias Piece = Char

fun simplifiedChessEngine(whites: Array<Array<Piece>>, blacks: Array<Array<Piece>>, moves: Int): String {
    placePieces(whites)
    placePieces(blacks)
    printBoard()
    return ""
}


fun availableMoves(piece: Piece, pos: Pos) =
    when (piece) {
        'N' -> knightMoves(pos)
        'Q' -> queenMoves(pos)
        'B' -> bishopMoves(pos)
        'R' -> rookMoves(pos)
        else -> error("Invalid Piece")
    }

fun queenMoves(pos: Pair<Int, Int>): List<Pair<Int, Int>> = listOf(up, down, left, right, up_left, up_right, down_left, down_right).fold(listOf<Pos>()){
        accum , next -> nextCell(accum, next, pos)
}

fun knightMoves(pos: Pos): List<Pos> =
    mutableListOf(1 to 2, 1 to -2, -1 to 2, -1 to -2, 2 to 1, 2 to -1, -2 to 1, -2 to -1).fold(listOf()){
        accum , next -> nextCell(accum, next, pos)
}

fun rookMoves(pos: Pos) = listOf(up, down, left, right).fold(listOf<Pos>()){
        accum , next -> nextCell(accum, next, pos)
}

fun bishopMoves(pos: Pos) = listOf(up_left, up_right, down_left, down_right).fold(listOf<Pos>()){
        accum , next -> nextCell(accum, next, pos)
}

fun nextCell(accum: List<Pos>, it: Pos, pos: Pos): List<Pos> {
    val x = it.first + pos.first
    val y = it.second + pos.second
    return if((x > -1 && x < 4) && (y > -1 && y < 4))
        accum + (x to y)
    else
        accum
}

fun printBoard(): Unit = board.forEach {
    println(it.contentToString())
}

fun placePieces(pieces: Array<Array<Char>>) {
    for (x in pieces)
        board[map[x[2]] ?: error("Error")][map[x[1]] ?: error("Error")] = x[0]
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
