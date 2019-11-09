package hackerrank.interviewpreparation.search

import java.util.*

// Complete the whatFlavors function below.
fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    //iterate thru the cost
    //at each index check to see if the cost is more than the money if so ignore
    //if not in the map then money - cost[i] as key and place the index as value
    val spend = hashMapOf<Int, Int>()
    for (i in cost.indices) {
        if (spend[cost[i]] != null)
            return println("${spend[cost[i]]!!} ${i + 1}")

        if (cost[i] < money)
            spend[money - cost[i]] = i + 1
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toLong()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()
        val n = scan.nextLine().trim().toInt()
        val cost = scan.nextLine().trim().split(" ").map { it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
