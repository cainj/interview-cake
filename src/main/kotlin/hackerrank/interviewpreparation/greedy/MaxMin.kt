package hackerrank.interviewpreparation.greedy

import java.util.*
import kotlin.math.min

// Complete the maxMin function below.
fun maxMin(k: Int, arr: IntArray): Int {
    arr.sort()
    var unFairness = if (k == arr.size) arr.last() - arr.first() else Int.MAX_VALUE
    for (i in 0..arr.size - k)
        unFairness = min(unFairness, arr[(i + k) - 1] - arr[i])
    return unFairness
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val k = scan.nextLine().trim().toInt()

    val arr = IntArray(n) { 0 }
    for (i in 0 until n) {
        val arrItem = scan.nextLine().trim().toInt()
        arr[i] = arrItem
    }

    val result = maxMin(k, arr)
    println(result)
}