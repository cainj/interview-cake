package hackerrank.datastructures.arrays

import java.lang.Integer.max
import java.util.*

// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {
    var maxValue = Integer.MIN_VALUE

    if (arr.size < 2)
        return arr[0]

    var twoBack = arr[0]
    var oneBack = arr[1]
    maxValue = max(twoBack, oneBack)

    for (i in 2 until arr.size) {
        val currentValue = arr[i] + twoBack
        maxValue = if (oneBack > currentValue)
            oneBack
        else
            currentValue

        twoBack = oneBack
        oneBack = maxValue
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
