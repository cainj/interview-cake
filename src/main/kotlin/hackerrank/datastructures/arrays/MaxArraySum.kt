package hackerrank.datastructures.arrays

import java.lang.Integer.max
import java.util.*

// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {

    if (arr.size < 2)
        return arr[0]

    var nonAdjacentMax = arr[0]
    var prevMax = max(nonAdjacentMax, arr[1])
    var maxValue = Int.MIN_VALUE

    for (i in 2 until arr.size) {
        val currentMax = max(arr[i], prevMax)
        maxValue = max(currentMax, arr[i] + nonAdjacentMax)
        nonAdjacentMax = prevMax
        prevMax = maxValue
    }

    return maxValue
}

fun main() {
    val scan = Scanner(System.`in`)
    readLine()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val res = maxSubsetSum(arr)

    println(res)
}
