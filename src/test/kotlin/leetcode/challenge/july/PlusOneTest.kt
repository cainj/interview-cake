package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class PlusOneTest {

    @Test
    fun plusOne() {
        val plusOne = PlusOne()
        assertArrayEquals(
            intArrayOf(1, 0),
            plusOne.plusOne(intArrayOf(9))
        )
        assertArrayEquals(
            intArrayOf(1, 0, 0),
            plusOne.plusOne(intArrayOf(9, 9))
        )
        assertArrayEquals(
            intArrayOf(1, 0, 0, 0, 1),
            plusOne.plusOne(intArrayOf(1, 0, 0, 0, 0))
        )
        assertArrayEquals(
            intArrayOf(1, 2, 4),
            plusOne.plusOne(intArrayOf(1, 2, 3))
        )
        assertArrayEquals(
            intArrayOf(1),
            plusOne.plusOne(intArrayOf())
        )
    }
}
