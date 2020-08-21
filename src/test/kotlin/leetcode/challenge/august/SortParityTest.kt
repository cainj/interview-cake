package leetcode.challenge.august

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SortParityTest {

    @Test
    fun sortArrayByParity() {
        val sa = SortParity()
        assertArrayEquals(intArrayOf(2, 4, 3, 1), sa.sortArrayByParity(intArrayOf(3, 1, 2, 4)))
    }
}
