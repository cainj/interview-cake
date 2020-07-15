package leetcode.facebook

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ShortestDistanceTest {

    @Test
    fun shortestDistance() {
        val sd = ShortestDistance()
        assertEquals(
            7,
            sd.shortestDistance(
                arrayOf(
                    intArrayOf(1, 0, 2, 0, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 1, 0, 0)
                )
            )
        )
        assertEquals(
            -1,
            sd.shortestDistance(
                arrayOf(
                    intArrayOf(1, 0, 2, 0, 1),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(2, 2, 1, 0, 2)
                )
            )
        )
    }
}
