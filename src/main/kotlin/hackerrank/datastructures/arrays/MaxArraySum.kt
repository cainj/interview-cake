package hackerrank.datastructures.arrays

import java.util.*


// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = maxSubsetSum(arr)
    println(res)
}
