package leetcode.recursionII

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Search2DMatrixTest {

    @Test
    fun searchMatrix() {
        val sm = Search2DMatrix()
        val matrix = arrayOf(
            intArrayOf(1,   4,  7, 11, 15),
            intArrayOf(2,   5,  8, 12, 19),
            intArrayOf(3,   6,  9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )

        assertEquals(true,sm.searchMatrix(matrix, 5))
        assertEquals(true,sm.searchMatrix(matrix, 22))
        assertEquals(false,sm.searchMatrix(matrix, 20))
        assertEquals(false,sm.searchMatrix(emptyArray(), 20))
        assertEquals(true,sm.searchMatrix(arrayOf(intArrayOf(1,1)), 1))
    }
}
