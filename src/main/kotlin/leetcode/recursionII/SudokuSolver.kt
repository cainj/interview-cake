package leetcode.recursionII

class SudokuSolver {

    fun solveSudoku(board: Array<CharArray>): Unit {
        backtrack(board)
        printBoard(board)
    }

    private fun backtrack(board: Array<CharArray>): Boolean {
        for (row in 0..8)
            for (col in 0..8)
                if (board[row][col] == '.') {
                    for (guess in '1'..'9') {
                        val pos = row to col
                        if (validGuess(guess, pos, board)) {
                            board[pos.first][pos.second] = guess
                            if (backtrack(board)) return true
                            else board[pos.first][pos.second] = '.'
                        }
                    }
                    return false
                }
        return true
    }

    private fun validGuess(guess: Char, pos: Pair<Int, Int>, board: Array<CharArray>): Boolean {
        for (i in 0..8) {
            if (board[pos.first][i] == guess) return false
            if (board[i][pos.second] == guess) return false
            if (board[(pos.first / 3) * 3 + i % 3][(pos.second / 3) * 3 + i / 3] == guess) return false
        }
        return true
    }

    private fun printBoard(board: Array<CharArray>) {
        for (row in board)
            println(row.toList())
    }
}
