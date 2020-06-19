package leetcode.challenge.june

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HIndexIITest {

    @Test
    fun hIndex() {
        val hIndexII = HIndexII()
        assertEquals(0, hIndexII.hIndex(intArrayOf()))
        assertEquals(0, hIndexII.hIndex(intArrayOf(0)))
        assertEquals(1, hIndexII.hIndex(intArrayOf(100)))
        assertEquals(4, hIndexII.hIndex(intArrayOf(10, 15, 17, 18)))
        assertEquals(3, hIndexII.hIndex(intArrayOf(0, 1, 2, 3, 5, 6)))
        assertEquals(5, hIndexII.hIndex(intArrayOf(0, 1, 2, 3, 5, 6, 7, 8, 9)))
    }
}
