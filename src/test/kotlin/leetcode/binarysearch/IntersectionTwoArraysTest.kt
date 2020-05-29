package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class IntersectionTwoArraysTest {

    @Test
    fun intersection() {
        val i = IntersectionTwoArrays()
        assertArrayEquals(intArrayOf(2), i.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
        assertArrayEquals(intArrayOf(4,9), i.intersection(intArrayOf(9, 4, 9, 8, 4), intArrayOf(2, 4, 9, 5)))
    }
}
