package hackerrank.interviewpreparation.search

import java.util.*

// Complete the whatFlavors function below.
fun whatFlavors(cost: Array<Int>, money: Int): Unit {

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()
        val n = scan.nextLine().trim().toInt()
        val cost = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
