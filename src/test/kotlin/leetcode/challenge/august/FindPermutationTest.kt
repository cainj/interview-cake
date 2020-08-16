package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class FindPermutationTest {

    @Test
    fun findPermutation() {
        val fp = FindPermutation()
        assertArrayEquals(intArrayOf(2, 1, 3), fp.findPermutation("DI"))
        assertArrayEquals(intArrayOf(3, 2, 1, 4, 6, 5, 7), fp.findPermutation("DDIIDI"))
    }
}
