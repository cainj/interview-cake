package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SearchRangeTest {

    @Test
    fun searchRange() {
        val sr = SearchRange()
        assertArrayEquals(intArrayOf(-1, -1), sr.searchRange(intArrayOf(), 0))
        assertArrayEquals(intArrayOf(-1, -1), sr.searchRange(intArrayOf(1, 2, 2, 3), 0))
        assertArrayEquals(intArrayOf(3, 4), sr.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8))
        assertArrayEquals(intArrayOf(0, 0), sr.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 5))
    }
}
