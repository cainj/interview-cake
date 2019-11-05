package hacker_rank.interview_preparation.greedy

import java.util.*

// Complete the getMinimumCost function below.
fun getMinimumCost(friends: Int, flowers: Int, costs: Array<Int>): Int {
    var minimuCost = 0

    return minimuCost
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()
    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val minimumCost = getMinimumCost(n, k, c)

    println(minimumCost)
}