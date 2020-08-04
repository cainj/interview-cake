package leetcode.hashtable

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ContainsDuplicatesTest {

    @Test
    fun containsDuplicate() {
        val containsDuplicates = ContainsDuplicates()
        assertEquals(false, containsDuplicates.containsDuplicate(intArrayOf(1, 2, 3, 4)))
        assertEquals(true, containsDuplicates.containsDuplicate(intArrayOf(1, 2, 3, 4, 1)))
        assertEquals(false, containsDuplicates.containsDuplicate(intArrayOf()))
    }
}
