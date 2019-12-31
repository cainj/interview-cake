package hackerrank.algorithms.graph_theory

/*
 * Complete the 'shop' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. STRING_ARRAY centers
 *  4. 2D_INTEGER_ARRAY roads
 */

fun shop(n: Int, k: Int, centers: Array<String>, roads: Array<Array<Int>>): Int {
    // Write your code here
    return 0
}

fun main(args: Array<String>) {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")
    val n = firstMultipleInput[0].toInt()
    val m = firstMultipleInput[1].toInt()
    val k = firstMultipleInput[2].toInt()

    val centers = Array<String>(n) { "" }
    for (i in 0 until n) {
        val centersItem = readLine()!!
        centers[i] = centersItem
    }

    val roads = Array<Array<Int>>(m) { Array<Int>(3) { 0 } }
    for (i in 0 until m) {
        roads[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val res = shop(n, k, centers, roads)
    println(res)
}
