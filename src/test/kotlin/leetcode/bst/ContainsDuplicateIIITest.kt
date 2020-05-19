package leetcode.bst

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ContainsDuplicateIIITest {

    @Test
    fun containsNearbyAlmostDuplicate() {
        val duplicates = ContainsDuplicateIII()
        assertEquals(true, duplicates.containsNearbyAlmostDuplicate(intArrayOf(1, 2, 3, 1), 3, 0))
        assertEquals(false, duplicates.containsNearbyAlmostDuplicate(intArrayOf(), 0, 0))
        assertEquals(false, duplicates.containsNearbyAlmostDuplicate(intArrayOf(1,5,9,1,5,9), 2, 3))
        assertEquals(true, duplicates.containsNearbyAlmostDuplicate(intArrayOf(10,100,11,9), 2, 1))
    }
}
