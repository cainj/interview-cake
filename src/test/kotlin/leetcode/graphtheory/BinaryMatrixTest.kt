package leetcode.graphtheory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@ExperimentalStdlibApi
internal class BinaryMatrixTest {

    @Test
    fun shortestPathBinaryMatrix() {
        val binaryMatrix = BinaryMatrix()
        assertEquals(
            10,
            binaryMatrix.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 0, 1, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 0, 0, 1),
                    intArrayOf(0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 1, 1, 1, 0),
                    intArrayOf(1, 0, 0, 1, 1, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1, 0, 1),
                    intArrayOf(0, 0, 1, 0, 0, 0, 0)
                )
            )
        )
        assertEquals(
            -1,
            binaryMatrix.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1, 1, 0, 0, 0, 0),
                    intArrayOf(1, 1, 0, 0, 1, 1, 1),
                    intArrayOf(0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 1, 1, 1, 0),
                    intArrayOf(1, 0, 0, 1, 1, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1, 0, 1),
                    intArrayOf(0, 0, 1, 0, 0, 0, 0)
                )
            )
        )
    }
}
