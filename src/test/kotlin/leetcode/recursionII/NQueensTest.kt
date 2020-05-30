package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NQueensTest {

    @Test
    fun solveNQueens() {
        val queens = NQueens()
        assertEquals(listOf(emptyList<String>()), queens.solveNQueens(0))
        assertEquals(listOf(listOf("Q")), queens.solveNQueens(1))
        assertEquals(listOf<List<String>>(), queens.solveNQueens(2))
        assertEquals(listOf<List<String>>(), queens.solveNQueens(3))
        assertEquals(
            listOf(listOf(".Q..", "...Q", "Q...", "..Q."), listOf("..Q.", "Q...", "...Q", ".Q..")),
            queens.solveNQueens(4)
        )
    }
}
