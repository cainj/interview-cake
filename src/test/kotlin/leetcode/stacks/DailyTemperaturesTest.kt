package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DailyTemperaturesTest {

    @Test
    fun dailyTemperatures() {
        val dt = DailyTemperatures()
        assertArrayEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
            dt.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))
        )

        assertArrayEquals(
            intArrayOf(0),
            dt.dailyTemperatures(intArrayOf(100))
        )
    }
}
