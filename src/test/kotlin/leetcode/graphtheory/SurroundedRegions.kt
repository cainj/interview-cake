package leetcode.graphtheory

class SurroundedRegions {

    private val neighbors = listOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun solve(board: Array<CharArray>): Unit {
        for (row in board.indices)
            for (col in board[0].indices)
                if (board[row][col] == 'O' && isOnBorder(board, row, col))
                    flip(row to col, board)
        for (row in board.indices)
            for (col in board[row].indices)
                if (board[row][col] == 'O')
                    board[row][col] = 'X'

        for (row in board.indices)
            for (col in board[row].indices)
                if (board[row][col] == 'A')
                    board[row][col] = 'O'
    }

    private fun printBoard(board: Array<CharArray>) {
        board.forEach { println(it.toList()) }
    }

    private fun flip(start: Pair<Int, Int>, board: Array<CharArray>) {
        if (start.first >= 0 && start.second >= 0
            && (start.first < board.size && start.second < board[0].size)
            && board[start.first][start.second] == 'O'
        ) {
            board[start.first][start.second] = 'A'
            for (n in neighbors)
                flip(start.first + n.first to start.second + n.second, board)
        }
    }

    private fun isOnBorder(board: Array<CharArray>, row: Int, col: Int): Boolean =
        (row == 0 || row == board.size - 1 || col == 0 || col == board[0].size - 1)
}
