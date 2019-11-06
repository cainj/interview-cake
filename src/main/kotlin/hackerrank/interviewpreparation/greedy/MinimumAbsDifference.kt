package hackerrank.interviewpreparation.greedy

import java.util.*
import kotlin.math.abs
import kotlin.math.min

// Complete the minimumAbsoluteDifference function below.
fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    arr.sort()
    var min = abs(arr[0] - arr[1])
    for (i in 0..arr.size - 2)
        min = min(min, abs(arr[i] - arr[i + 1]))

    return min

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)

    println(result)
}
