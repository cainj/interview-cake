package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LargestDivisibleTest {

    @Test
    fun largestDivisibleSubset() {
        val lds = LargestDivisible()
        assertEquals(listOf(1, 2, 4, 8), lds.largestDivisibleSubset(intArrayOf(1, 2, 4, 8)))
        assertEquals(listOf(1, 2, 4, 8, 24), lds.largestDivisibleSubset(intArrayOf(1, 2, 3, 4, 8, 6, 12, 24)))
        assertEquals(listOf(1), lds.largestDivisibleSubset(intArrayOf(1)))
        assertEquals(emptyList<Int>(), lds.largestDivisibleSubset(intArrayOf()))
    }
}
