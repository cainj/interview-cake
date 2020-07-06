package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LargestHistogramTest {

    @Test
    fun largestRectangleArea() {
        val lr = LargestHistogram()
        assertEquals(0, lr.largestRectangleArea(intArrayOf()))
        assertEquals(4, lr.largestRectangleArea(intArrayOf(4, 2, 1)))
        assertEquals(10, lr.largestRectangleArea(intArrayOf(2,1,5,6,2,3)))
        assertEquals(9, lr.largestRectangleArea(intArrayOf(1,2,3,4,5)))
    }
}
