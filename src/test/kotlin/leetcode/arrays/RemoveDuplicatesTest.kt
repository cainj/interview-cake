package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesTest {

    @Test
    fun removeDuplicates() {
        val rd = RemoveDuplicates()
        var nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(5, rd.removeDuplicates(nums))
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4, 2, 2, 3, 3, 4), nums)

        nums = intArrayOf(1, 1, 2)
        assertEquals(2, rd.removeDuplicates(nums))
        assertArrayEquals(intArrayOf(1, 2, 2), nums)

        nums = intArrayOf(0)
        assertEquals(1, rd.removeDuplicates(nums))
        assertArrayEquals(intArrayOf(0), nums)
    }
}
