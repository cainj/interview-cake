package hackerrank.interviewpreparation.greedy

import java.util.*

// Complete the luckBalance function below.
fun luckBalance(allowedToLose: Int, contests: Array<Array<Int>>): Int {
    var balance = 0
    contests.sortByDescending { it[0] * it[1] }

    for (i in contests.indices)
        if (contests[i][1] == 1 && i + 1 > allowedToLose)
            balance -= contests[i][0]
        else
            balance += contests[i][0]

    return balance
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val contests = Array(n) { Array<Int>(2, { 0 }) }

    for (i in 0 until n) {
        contests[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = luckBalance(k, contests)

    println(result)
}