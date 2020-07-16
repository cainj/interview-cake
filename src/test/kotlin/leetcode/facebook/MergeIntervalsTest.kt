package leetcode.facebook

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MergeIntervalsTest {

    @Test
    fun tests() {
        val mergeIntervals = MergeIntervals()
        assertArrayEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
            mergeIntervals.merge(
                arrayOf(
                    intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)
                )
            )
        )
        assertArrayEquals(
            arrayOf(),
            mergeIntervals.merge(
                arrayOf(
                )
            )
        )
        assertArrayEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
            mergeIntervals.merge(
                arrayOf(
                    intArrayOf(5, 5),
                    intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)
                )
            )
        )
    }
}
