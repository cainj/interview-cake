package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SubarraySumTest {

    @Test
    fun subarraySum() {
        val ss = SubarraySum()
        var nums = intArrayOf(1, 1, 1)
        assertEquals(2, ss.subarraySum(nums, 2))
        nums = intArrayOf(3, 4, 7, 2, -3, 1, 4, 2)
        assertEquals(2, ss.subarraySum(nums, 14))
    }
}
