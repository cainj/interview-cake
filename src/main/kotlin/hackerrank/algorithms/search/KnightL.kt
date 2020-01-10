package hackerrank.algorithms.search

import java.util.*

// Complete the knightlOnAChessboard function below.
fun knightlOnAChessboard(n: Int): Array<Array<Int>> {


}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val result = knightlOnAChessboard(n)

    println(result.joinToString("\n") { it.joinToString(" ") })
}
