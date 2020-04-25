package bs

import leetcode.binarysearch.BinarySearch
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {

    @Test
    fun search() {
        val bs = BinarySearch()
        var nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        assertEquals(0, bs.search(nums, -1))
        assertEquals(1, bs.search(nums, 0))
        assertEquals(2, bs.search(nums, 3))
        assertEquals(3, bs.search(nums, 5))
        assertEquals(4, bs.search(nums, 9))
        assertEquals(5, bs.search(nums, 12))
        assertEquals(-1, bs.search(nums, 2))

        nums = intArrayOf(-1, 0, 3, 5, 9)
        assertEquals(0, bs.search(nums, -1))
        assertEquals(1, bs.search(nums, 0))
        assertEquals(2, bs.search(nums, 3))
        assertEquals(3, bs.search(nums, 5))
        assertEquals(4, bs.search(nums, 9))
        assertEquals(-1, bs.search(nums, 12))

        assertEquals(-1, bs.search(intArrayOf(), 100))
    }
}
