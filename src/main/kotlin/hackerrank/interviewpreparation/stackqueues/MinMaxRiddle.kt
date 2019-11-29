package hackerrank.interviewpreparation.stackqueues

import java.util.*
import kotlin.math.max
import kotlin.math.min

// Complete the riddle function below.
fun riddle(arr: Array<Long>): List<Long> {
    val riddle = arr.toList().plus(0L)
    val dequeue = ArrayDeque<Pair<Long, Long>>()
    val maxWindows = hashMapOf<Long, Long>()

    for (value in riddle) {
        var window = 0L
        while (dequeue.isNotEmpty() && dequeue.peek().first > value) {
            window += dequeue.peek().second
            if (maxWindows[window + 1] != null)
                maxWindows[window + 1] = max(maxWindows[window + 1] ?: -1L, dequeue.peek().first)
            else
                maxWindows[window + 1] = dequeue.peek().first
            dequeue.pop()
            window++
        }
        dequeue.push(value to window)
    }

    val ans = mutableListOf<Long>()

    for (i in 1L..arr.size) {
        if (maxWindows[i] != null) {
            if (ans.isNotEmpty()) {
                var k = 0
                while (k in 0..i - 2 && maxWindows[i]!! > ans[(i - 2 - k).toInt()]) {
                    ans[(i - 2 - k).toInt()] = maxWindows[i]!!
                    k++
                }
            }
            ans.add(maxWindows[i]!!)
        } else {
            ans.add(-1L)
        }

    }
    //8
    //11 2 3 14 5 2 11 12

    return ans
}

private fun bruteForce(arr: Array<Long>, index: Int): Long {
    var min = -1L
    for (i in 0 until arr.size - index) {
        var miniMin = arr[i]
        for (windowStart in i..i + index)
            miniMin = min(miniMin, arr[windowStart])
        min = max(min, miniMin)
    }
    return min
}

fun main() {
    val scan = Scanner(System.`in`)
    scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
    val res = riddle(arr)
    println(res.joinToString(" "))
}
