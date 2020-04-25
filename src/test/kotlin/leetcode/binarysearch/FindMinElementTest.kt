package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindMinElementTest {

    @Test
    fun findMin() {
        val fme = FindMinElement()
        assertEquals(1, fme.findMin(intArrayOf(3, 4, 5, 1, 2)))
        assertEquals(0, fme.findMin(intArrayOf(3, 4, 5, 6, 7, 8, 10, 0, 1, 2)))
        assertEquals(3, fme.findMin(intArrayOf(3)))
    }
}
