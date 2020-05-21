package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class PlusOneTest {

    @Test
    fun plusOne() {
        val po = PlusOne()
        assertArrayEquals(intArrayOf(1, 0), po.plusOne(intArrayOf(9)))
        assertArrayEquals(intArrayOf(1, 0, 0, 0), po.plusOne(intArrayOf(9, 9, 9)))
        assertArrayEquals(intArrayOf(3, 0, 0), po.plusOne(intArrayOf(2, 9, 9)))
        assertArrayEquals(intArrayOf(1, 2, 4), po.plusOne(intArrayOf(1, 2, 3)))
    }
}
