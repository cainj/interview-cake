package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindPeakElementTest {

    @Test
    fun findPeakElement() {
        val fpe = FindPeakElement()
        assertEquals(4, fpe.findPeakElement(intArrayOf(1, 3, 5, 6, 7, 2)))
        assertEquals(0, fpe.findPeakElement(intArrayOf(1)))
        assertEquals(2, fpe.findPeakElement(intArrayOf(1, 2, 3, 1)))
        assertEquals(5, fpe.findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
    }
}
