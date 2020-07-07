package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NegativeNumberSortedTest {

    @Test
    fun countNegatives() {
        val cn = NegativeNumberSorted()
        assertEquals(0, cn.countNegatives(arrayOf(intArrayOf(1))))
        assertEquals(
            8,
            cn.countNegatives(
                arrayOf(
                    intArrayOf(4, 3, 2, -1),
                    intArrayOf(3, 2, 1, -1),
                    intArrayOf(1, 1, -1, -2),
                    intArrayOf(-1, -1, -2, -3)
                )
            )
        )
        assertEquals(
            0,
            cn.countNegatives(
                arrayOf(
                    intArrayOf(4, 3, 2, 0),
                    intArrayOf(3, 2, 1, 0)
                )
            )
        )
        assertEquals(
            3,
            cn.countNegatives(
                arrayOf(
                    intArrayOf(1, -1),
                    intArrayOf(-1, -1)
                )
            )
        )
    }
}
