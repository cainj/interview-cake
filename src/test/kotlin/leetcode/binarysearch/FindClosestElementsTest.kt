package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindClosestElementsTest {

    @Test
    fun findClosestElements() {
        val fce = FindClosestElements()
        assertEquals(listOf(2, 3, 4, 5), fce.findClosestElements(intArrayOf(1, 2, 3, 4, 5), 4, 4))
        assertEquals(listOf(1, 2, 3, 4, 5), fce.findClosestElements(intArrayOf(1, 2, 3, 4, 5), 5, 1))
        assertEquals(listOf(2, 3, 4, 5), fce.findClosestElements(intArrayOf(1, 2, 3, 4, 5), 4, 6))
        assertEquals(listOf(1, 2, 3, 4), fce.findClosestElements(intArrayOf(1, 2, 3, 4, 5), 4, 0))
    }
}
