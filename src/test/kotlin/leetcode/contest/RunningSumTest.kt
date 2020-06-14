package leetcode.contest

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class RunningSumTest {

    @Test
    fun runningSum() {
        val rs = RunningSum()
        assertArrayEquals(intArrayOf(1, 3, 6, 10), rs.runningSum(intArrayOf(1, 2, 3, 4)))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), rs.runningSum(intArrayOf(1, 1, 1, 1, 1)))
        assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), rs.runningSum(intArrayOf(3, 1, 2, 10, 1)))
    }
}
