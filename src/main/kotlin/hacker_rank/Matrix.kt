package hacker_rank

import java.util.*

// Complete the minTime function below.
fun minTime(roads: Array<Array<Int>>, machines: Array<Int>): Int {
    TODO()
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val roads = Array(n - 1) { Array(3) { 0 } }

    for (i in 0 until n - 1) {
        roads[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val machines = Array(k) { 0 }
    for (i in 0 until k) {
        val machinesItem = scan.nextLine().trim().toInt()
        machines[i] = machinesItem
    }

    val result = minTime(roads, machines)

    println(result)
}
