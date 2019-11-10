package hackerrank.interviewpreparation.greedy

import java.util.*

// Complete the getMinimumCost function below.
fun getMinimumCost(k: Int, costs: Array<Int>): Int {
    var minimumCost = 0
    val friendPurchase = IntArray(k)
    costs.sort()

    //make sure the array is sorted
    //take a friend make the most expensive purchase first
    //then skip to back i - (# of friends)
    for (i in costs.size - 1 downTo 0) {
        val friend = i % (friendPurchase.size)
        minimumCost += costs[i] * (1 + friendPurchase[friend])
        friendPurchase[friend] += 1
    }

    return minimumCost
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nk = scan.nextLine().split(" ")
    val k = nk[1].trim().toInt()
    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val minimumCost = getMinimumCost(k, c)

    println(minimumCost)
}
