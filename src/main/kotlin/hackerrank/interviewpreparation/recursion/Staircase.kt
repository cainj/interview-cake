package hackerrank.interviewpreparation.recursion

import java.util.*

// Complete the stepPerms function below.
fun stepPerms(n: Int): Int {
    var result = 0
    return result
}

fun main() {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine().trim().toInt()

    for (sItr in 1..s) {
        val n = scan.nextLine().trim().toInt()
        val res = stepPerms(n)
        println(res)
    }
}
