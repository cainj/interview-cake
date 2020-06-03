package leetcode.graphtheory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CollectingApplesTest {

    @Test
    fun minTime() {
        val minTime = CollectingApples()
        assertEquals(
            8,
            minTime.minTime(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 4),
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(2, 6)
                ),
                arrayListOf(false, false, true, false, true, true, false)
            )
        )

        assertEquals(
            6,
            minTime.minTime(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 4),
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(2, 6)
                ),
                arrayListOf(false, false, true, false, false, true, false)
            )
        )

        assertEquals(
            0,
            minTime.minTime(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 4),
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(2, 6)
                ),
                arrayListOf(false, false, false, false, false, false, false)
            )
        )
    }
}
