package leetcode.recursionII

class WordSearch {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (row in board.indices)
            for (col in board[0].indices)
                if (board[row][col] == word[0])
                    if (backtracking(0, row, col, word, board)) return true

        return false
    }


    private fun backtracking(index: Int, r: Int, c: Int, word: String, board: Array<CharArray>): Boolean {
        if (index == word.length) return true

        if ((r == board.size || c == board[0].size)
            || (r < 0 || c < 0)
            || board[r][c] != word[index]
        ) return false

        val directions = listOf(r to c + 1, r to c - 1, r + 1 to c, r - 1 to c)
        board[r][c] = '#'

        for ((row, col) in directions)
            if (backtracking(index + 1, row, col, word, board)) return true

        board[r][c] = word[index]
        return false
    }
}
