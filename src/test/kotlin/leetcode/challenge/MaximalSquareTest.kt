package leetcode.challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximalSquareTest {

    @Test
    fun maximalSquare() {
        val ms = MaximalSquare()
        var matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        assertEquals(4, ms.maximalSquare(matrix))
        matrix = arrayOf(
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        assertEquals(9, ms.maximalSquare(matrix))
    }
}