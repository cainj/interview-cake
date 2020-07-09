package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class `3SumTest` {
    @Test
    fun sumTest() {
        val sum = `3Sum`()
        assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), sum.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    }
}
