package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximumProbabilityTest {

    @Test
    fun maxProbability() {
        val mp = MaximumProbability()
        assertEquals(
            0.25, mp.maxProbability(
                3,
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)),
                doubleArrayOf(0.5, 0.5, 0.2),
                0,
                2
            )
        )
        assertEquals(
            0.3, mp.maxProbability(
                3,
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)),
                doubleArrayOf(0.5, 0.5, 0.3),
                0,
                2
            )
        )
        assertEquals(
            0.0, mp.maxProbability(
                3,
                arrayOf(intArrayOf(0, 1)),
                doubleArrayOf(0.5),
                0,
                2
            )
        )
    }
}
