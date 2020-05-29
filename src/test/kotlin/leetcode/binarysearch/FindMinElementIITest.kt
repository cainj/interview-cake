package leetcode.binarysearch

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindMinElementIITest {

    @Test
    fun findMin() {
        val fm = FindMinElementII()
        assertEquals(1, fm.findMin(intArrayOf(1,3,5)))
        assertEquals(1, fm.findMin(intArrayOf(3,3,3,3,3,1)))
        assertEquals(2, fm.findMin(intArrayOf(3,2,3,3,3)))
        assertEquals(0, fm.findMin(intArrayOf(10,0,3,7,9)))
    }
}
