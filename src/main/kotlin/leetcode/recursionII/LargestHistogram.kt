package leetcode.recursionII

import java.util.*
import kotlin.math.max

class LargestHistogram {

    fun largestRectangleArea(heights: IntArray): Int {
        var max = 0
        val rectangles = LinkedList<Int>()

        for (i in heights.indices) {
            if (rectangles.isEmpty() || heights[i] >= heights[rectangles.peek()]) rectangles.push(i)
            else {
                while (rectangles.isNotEmpty() && heights[i] < heights[rectangles.peek()])
                    max = findMax(rectangles, max, i, heights)
                rectangles.push(i)
            }
        }

        while (rectangles.isNotEmpty())
            max = findMax(rectangles, max, heights.size, heights)

        return max
    }

    private fun findMax(rectangles: LinkedList<Int>, max: Int, i: Int, heights: IntArray): Int {
        val height = heights[rectangles.pop()]
        return if(rectangles.isNotEmpty()) max( max, height * (i - rectangles.peek() - 1))
        else max(max, height * i)
    }
}
