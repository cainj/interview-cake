package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PivotIndexTest {

    @Test
    fun pivotIndex() {
        val pi = PivotIndex()
        assertEquals(3, pi.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
        assertEquals(-1, pi.pivotIndex(intArrayOf(1, 2, 3)))
        assertEquals(0, pi.pivotIndex(intArrayOf(1)))
    }
}
