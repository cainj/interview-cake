package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ThreeSumTest {
    @Test
    fun sumTest() {
        val sum = ThreeSum()
        assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), sum.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    }
}
