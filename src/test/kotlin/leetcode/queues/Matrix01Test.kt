package leetcode.queues

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class Matrix01Test {

    @Test
    fun updateMatrix() {
        val matrix = Matrix01()
        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
            ), matrix.updateMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 0)
                )
            )
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
            ), matrix.updateMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(0, 0, 0)
                )
            )
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(1, 2, 1)
            ), matrix.updateMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(1, 1, 1)
                )
            )
        )
    }
}
