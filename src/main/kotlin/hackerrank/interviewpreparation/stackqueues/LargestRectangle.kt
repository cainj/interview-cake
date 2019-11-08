package hackerrank.interviewpreparation.stackqueues

import java.util.*
import kotlin.math.max

// Complete the largestRectangle function below.
fun largestRectangle(heights: IntArray): Long {
    val dequeue = ArrayDeque<Pair<Int, Int>>()
    dequeue.add(heights[0] to 0)
    var largest = 0L
    for (index in 1 until heights.size) {
        if (heights[index] > heights[index - 1])
            dequeue.push(heights[index] to index)
        else {
            val height = heights[index]
            var width = index
            while (dequeue.isNotEmpty() && height < dequeue.peek().first) {
                val rectangle = dequeue.pop()
                width = rectangle.second
                largest = max(largest, rectangle.first * (index - width).toLong())
            }
            dequeue.push(heights[index] to width)
        }
    }
    largest = dequeue.fold(largest) { max, pair ->
        max(max, pair.first * (heights.size - pair.second).toLong())
    }

    return largest
}

fun main() {
    val scan = Scanner(System.`in`)
    scan.nextLine().trim().toInt()
    val h = scan.nextLine().split(" ").map { it.trim().toInt() }.toIntArray()
    val result = largestRectangle(h)

    print(result)
}