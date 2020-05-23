package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class DiagonalTraverseTest {

    @Test
    fun findDiagonalOrder() {
        val diagonalTraverse = DiagonalTraverse()
        assertArrayEquals(
            intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9),
            diagonalTraverse.findDiagonalOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
        )
        assertArrayEquals(intArrayOf(), diagonalTraverse.findDiagonalOrder(arrayOf(intArrayOf())))
    }
}
