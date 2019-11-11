package hackerrank.interviewpreparation.search

import java.util.*

// Complete the minTime function below.
fun minTime(machines: Array<Long>, goal: Long): Long {
    return 0L
}

fun main() {
    val scan = Scanner(System.`in`)
    val nGoal = scan.nextLine().split(" ")
    val goal = nGoal[1].trim().toLong()
    val machines = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
    val ans = minTime(machines, goal)

    println(ans)
}