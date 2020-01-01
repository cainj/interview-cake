package hackerrank.algorithms.graphtheory

import java.util.*

/*
 * Complete the componentsInGraph function below.
 */
fun componentsInGraph(gb: Array<Array<Int>>): Array<Int> {
    /*
     * Write your code here.
     */
    TODO()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val gb = Array(n) { Array<Int>(2) { 0 } }

    for (gbRowItr in 0 until n) {
        gb[gbRowItr] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = componentsInGraph(gb)
    println(result.joinToString(" "))
}
