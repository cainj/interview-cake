package leetcode.graphtheory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@ExperimentalStdlibApi
internal class BinaryMatrixTest {

    @Test
    fun shortestPathBinaryMatrix() {
        val binaryMatrix = BinaryMatrix()
        assertEquals(
            4,
            binaryMatrix.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
        assertEquals(
            2,
            binaryMatrix.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0)
                )
            )
        )
    }
}
