package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LeftMostColumnTest {

    @Test
    fun leftMostColumnWithOne() {
        var bm = BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 0),
                intArrayOf(0, 0)
            )
        )
        val lmc = LeftMostColumn()
        assertEquals(-1, lmc.leftMostColumnWithOne(bm))
        bm = BinaryMatrix(
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 0),
                intArrayOf(0, 0)
            )
        )
        assertEquals(1, lmc.leftMostColumnWithOne(bm))
        bm = BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
                intArrayOf(0, 0)
            )
        )
        assertEquals(0, lmc.leftMostColumnWithOne(bm))
        bm = BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 0, 0, 1)
            )
        )
        assertEquals(3, lmc.leftMostColumnWithOne(bm))
    }
}
