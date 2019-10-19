package hacker_rank

import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    ar.sort()
    var i = 0
    var j = 1
    var pairs = 0
    val limit = n - 1
    while (i < ar.size - 1) {
        if (i < limit && j <= limit && ar[i] == ar[j]) {
            i += 2
            j += 2
            pairs++
        } else {
            i++
            j++
        }
    }
    return pairs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
