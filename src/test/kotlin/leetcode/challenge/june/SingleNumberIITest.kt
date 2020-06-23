package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SingleNumberIITest {

    @Test
    fun singleNumber() {
        val singleNumberII = SingleNumberII()
        assertEquals(3, singleNumberII.singleNumber(intArrayOf(2, 2, 3, 2)))
        assertEquals(99, singleNumberII.singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
        assertEquals(5, singleNumberII.singleNumber(intArrayOf(2, 2, 3, 2, 3, 3, 4, 4, 4, 5)))
    }
}
