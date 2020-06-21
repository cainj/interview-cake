package leetcode.contest

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class AvoidFloodTest {

    @Test
    fun avoidFlood() {
        val avoidFlood = AvoidFlood()
        assertArrayEquals(intArrayOf(), avoidFlood.avoidFlood(intArrayOf(1, 2, 0, 1, 2)))
        assertArrayEquals(intArrayOf(-1, -1, 2, 1, -1, -1), avoidFlood.avoidFlood(intArrayOf(1, 2, 0, 0, 2, 1)))
        assertArrayEquals(intArrayOf(), avoidFlood.avoidFlood(intArrayOf(20, 10, 10)))
        assertArrayEquals(intArrayOf(-1, 69, 1, -1), avoidFlood.avoidFlood(intArrayOf(69, 0, 0, 69)))
    }
}
