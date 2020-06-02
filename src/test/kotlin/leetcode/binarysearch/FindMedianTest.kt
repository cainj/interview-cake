package leetcode.binarysearch

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindMedianTest {

    @Test
    fun findMedianSortedArrays() {
        val median = FindMedian()
        assertEquals(2.0000, median.findMedianSortedArrays(intArrayOf(), intArrayOf(2)))
        assertEquals(2.5000, median.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4)))
        assertEquals(11.0000, median.findMedianSortedArrays(intArrayOf(1,3,8,9,12), intArrayOf(7,11,19,21,18,25)))
        assertEquals(2.0000, median.findMedianSortedArrays(intArrayOf(2), intArrayOf(1, 3)))
    }
}
