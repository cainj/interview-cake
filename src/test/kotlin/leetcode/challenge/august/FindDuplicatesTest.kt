package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindDuplicatesTest {

    @Test
    fun findDuplicates() {
        val findDuplicates = FindDuplicates()
        assertEquals(listOf(2), findDuplicates.findDuplicates(intArrayOf(1, 2, 2, 4)))
        assertEquals(listOf(2, 3), findDuplicates.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
        assertEquals(emptyList<Int>(), findDuplicates.findDuplicates(intArrayOf()))
    }
}
