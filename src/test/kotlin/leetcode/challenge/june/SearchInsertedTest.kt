package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SearchInsertedTest {

    @Test
    fun searchInsert() {
        val si = SearchInserted()
        assertEquals(2, si.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, si.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(0, si.searchInsert(intArrayOf(1, 3, 5, 6), 0))
        assertEquals(4, si.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }
}
