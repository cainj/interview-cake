package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinimumSumSubArrayTest {

    @Test
    fun minSubArrayLen() {
        val minSumSubArray = MinimumSumSubArray()
        assertEquals(2, minSumSubArray.minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
        assertEquals(1, minSumSubArray.minSubArrayLen(1, intArrayOf(2, 3, 1, 2, 4, 3)))
        assertEquals(2, minSumSubArray.minSubArrayLen(5, intArrayOf(2, 3, 1, 2, 4, 3)))
        assertEquals(3, minSumSubArray.minSubArrayLen(9, intArrayOf(2, 3, 1, 2, 4, 3)))
    }
}
