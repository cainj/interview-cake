package hackerrank.algorithms.strings

import java.util.*

// Complete the highestValuePalindrome function below.
fun highestValuePalindrome(s: String, n: Int, k: Int): String {
    TODO()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()
    val s = scan.nextLine()
    val result = highestValuePalindrome(s, n, k)

    println(result)
}
