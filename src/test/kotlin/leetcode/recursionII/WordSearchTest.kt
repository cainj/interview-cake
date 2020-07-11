package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordSearchTest {

    @Test
    fun exist() {
        val wordSearch = WordSearch()
        var board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        assertEquals(true, wordSearch.exist(board, "SEE"))
        board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )

        assertEquals(false, wordSearch.exist(board, "SEA"))
        board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        assertEquals(true, wordSearch.exist(board, "ABCCED"))
        board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        assertEquals(false, wordSearch.exist(board, "ABCB"))
    }
}
