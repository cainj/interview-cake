package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class FloodFillTest {

    @Test
    fun floodFill() {
        val ff = FloodFill()
        assertArrayEquals(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)),
            ff.floodFill(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), 1, 1, 2)
        )
    }
}
