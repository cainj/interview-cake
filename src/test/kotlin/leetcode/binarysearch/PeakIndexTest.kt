package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PeakIndexTest {

    @Test
    fun peakIndexInMountainArray() {
        val peakIndex = PeakIndex()
        assertEquals(1, peakIndex.peakIndexInMountainArray(intArrayOf(0, 1, 0)))
        assertEquals(1, peakIndex.peakIndexInMountainArray(intArrayOf(0, 2, 1, 0)))
        assertEquals(5, peakIndex.peakIndexInMountainArray(intArrayOf(0, 2, 4, 6, 7, 8, 6, 5, 3, 2, 1, 0)))
    }
}
