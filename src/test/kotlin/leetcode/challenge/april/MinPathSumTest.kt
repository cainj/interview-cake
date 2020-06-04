package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinPathSumTest {

    @Test
    fun minPathSum() {
        val mps = MinPathSum()
        assertEquals(7, mps.minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))))
    }
}
