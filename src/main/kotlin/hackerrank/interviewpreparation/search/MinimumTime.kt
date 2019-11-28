package hackerrank.interviewpreparation.search

import java.util.*

// Complete the minTime function below.
fun minTime(machines: Array<Long>, goal: Long): Long {
    machines.sort()
    var min = machines[0]
    var max = machines[machines.size - 1] * goal
    var result = -1L

    while (min < max) {
        val mid = (min + max) / 2
        var total = 0L
        for (machine in machines)
            total += mid / machine
        if (total < goal)
            min = mid + 1
        else {
            max = mid
            result = max
        }
    }

    return result
}

fun main() {
    val scan = Scanner(System.`in`)
    val nGoal = scan.nextLine().split(" ")
    val goal = nGoal[1].trim().toLong()
    val machines = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
    val ans = minTime(machines, goal)

    println(ans)
}
