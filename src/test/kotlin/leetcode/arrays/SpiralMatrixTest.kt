package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SpiralMatrixTest {

    @Test
    fun spiralOrder() {
        val spiralMatrix = SpiralMatrix()
        var matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        assertEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), spiralMatrix.spiralOrder(matrix))
        matrix = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        assertEquals(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), spiralMatrix.spiralOrder(matrix))
    }
}
