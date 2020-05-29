package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindDuplicateNumberTest {

    @Test
    fun findDuplicate() {
        val duplicate = FindDuplicateNumber()
        assertEquals(3, duplicate.findDuplicate(intArrayOf(1, 2, 3, 3, 4)))
        assertEquals(3, duplicate.findDuplicate(intArrayOf(1, 3, 3, 3, 4)))
        assertEquals(9, duplicate.findDuplicate(intArrayOf(1, 2, 9, 3, 4, 5, 9, 6, 9, 8)))
    }
}
