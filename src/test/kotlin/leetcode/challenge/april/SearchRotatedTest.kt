package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SearchRotatedTest {

    @Test
    fun search() {

        val sr = SearchRotated()
        var nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        assertEquals(0, sr.search(nums, 4))
        assertEquals(1, sr.search(nums, 5))
        assertEquals(2, sr.search(nums, 6))
        assertEquals(3, sr.search(nums, 7))
        assertEquals(4, sr.search(nums, 0))
        assertEquals(5, sr.search(nums, 1))
        assertEquals(6, sr.search(nums, 2))
        assertEquals(-1, sr.search(nums, 20))

        nums = intArrayOf(4, 5, 6, 7, 1, 2)
        assertEquals(0, sr.search(nums, 4))
        assertEquals(1, sr.search(nums, 5))
        assertEquals(2, sr.search(nums, 6))
        assertEquals(3, sr.search(nums, 7))
        assertEquals(-1, sr.search(nums, 0))
        assertEquals(4, sr.search(nums, 1))
        assertEquals(5, sr.search(nums, 2))

        assertEquals(-1, sr.search(intArrayOf(), 20))
    }
}
