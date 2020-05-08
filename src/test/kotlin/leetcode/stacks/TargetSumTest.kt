package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TargetSumTest {

    @Test
    fun findTargetSumWays() {
        val t = TargetSum()
        assertEquals(5, t.findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3))
        t.count = 0
        assertEquals(0, t.findTargetSumWays(intArrayOf(1, 1, 1), 2))
        assertEquals(2, t.findTargetSumWays(intArrayOf(0), 0))
    }
}
