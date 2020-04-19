package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BinarySearchTest {

    @Test
    fun search() {
        var nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        assertEquals(0, leetcode.binarysearch.search(nums, -1))
        assertEquals(1, leetcode.binarysearch.search(nums, 0))
        assertEquals(2, leetcode.binarysearch.search(nums, 3))
        assertEquals(3, leetcode.binarysearch.search(nums, 5))
        assertEquals(4, leetcode.binarysearch.search(nums, 9))
        assertEquals(5, leetcode.binarysearch.search(nums, 12))
        assertThrows<IllegalStateException> { search(nums, 120) }

        nums = intArrayOf(-1, 0, 3, 5, 9)
        assertEquals(0, leetcode.binarysearch.search(nums, -1))
        assertEquals(1, leetcode.binarysearch.search(nums, 0))
        assertEquals(2, leetcode.binarysearch.search(nums, 3))
        assertEquals(3, leetcode.binarysearch.search(nums, 5))
        assertEquals(4, leetcode.binarysearch.search(nums, 9))
        assertThrows<IllegalStateException> { search(nums, 12) }

    }
}