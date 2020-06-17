package leetcode.graphtheory

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SurroundedRegionsTest {

    @Test
    fun solve() {
        val surroundedRegions = SurroundedRegions()
        var board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )
        surroundedRegions.solve(board)
        assertArrayEquals(
            arrayOf(
                charArrayOf('X', 'X', 'X', 'X'),
                charArrayOf('X', 'X', 'X', 'X'),
                charArrayOf('X', 'X', 'X', 'X'),
                charArrayOf('X', 'O', 'X', 'X')
            ),
            board
        )

        board = arrayOf(
            charArrayOf('O', 'O', 'O', 'O'),
            charArrayOf('O', 'O', 'O', 'O'),
            charArrayOf('O', 'O', 'O', 'O')
        )
        surroundedRegions.solve(board)
        assertArrayEquals(
            arrayOf(
                charArrayOf('O', 'O', 'O', 'O'),
                charArrayOf('O', 'O', 'O', 'O'),
                charArrayOf('O', 'O', 'O', 'O')
            ),
            board
        )
    }
}
