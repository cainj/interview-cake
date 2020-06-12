package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SortColorsTest {

    @Test
    fun sortColors() {
        val sc = SortColors()
        var colors = intArrayOf(0, 2, 2)
        sc.sortColors(colors)
        assertArrayEquals(intArrayOf(0, 2, 2), colors)
        colors = intArrayOf(2, 0, 2, 1, 1, 0)
        sc.sortColors(colors)
        assertArrayEquals(intArrayOf(0, 0, 1, 1, 2, 2), colors)
    }
}
