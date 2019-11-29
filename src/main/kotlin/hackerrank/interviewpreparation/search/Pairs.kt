package hackerrank.interviewpreparation.search

import java.util.*

// Complete the pairs function below.
fun pairs(k: Int, arr: Array<Int>): Int {
    val sum = hashSetOf<Int>()
    val diff = hashSetOf<Int>()
    arr.forEach {
        if (it - k > 0)
            diff.add(it)
        sum.add(it + k)
    }
    return diff.intersect(sum).size
}

fun main() {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val k = nk[1].trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = pairs(k, arr)

    println(result)
}
