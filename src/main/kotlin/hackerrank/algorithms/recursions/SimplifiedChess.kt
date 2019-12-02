package hackerrank.algorithms.recursions

import java.util.*

/*
 * Complete the simplifiedChessEngine function below.
 */
fun simplifiedChessEngine(whites: Array<Array<Char>>, blacks: Array<Array<Char>>, moves: Int): String {
    return ""
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
