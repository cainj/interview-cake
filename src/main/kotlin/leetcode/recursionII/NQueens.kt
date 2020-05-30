package leetcode.recursionII

import kotlin.math.abs

class NQueens {

    fun solveNQueens(n: Int): List<List<String>> {
        val result = mutableListOf<List<Int>>()
        solve(n, 0, mutableListOf(), result)
        return createBoard(result)
    }

    private fun solve(n: Int, row: Int, queens: MutableList<Int>, result: MutableList<List<Int>>) {
        if (row == n) result.add(ArrayList(queens))
        else {
            for (col in 0 until n) {
                queens.add(col)
                if (isValid(queens)) solve(n, row + 1, queens, result)
                queens.removeAt(queens.size - 1)
            }
        }
    }

    private fun isValid(queens: List<Int>): Boolean {
        val rowId = queens.size - 1
        for (i in 0 until rowId) {
            val diff = abs(queens[i] - queens[rowId])
            if (diff == 0 || diff == rowId - i) return false
        }

        return true
    }

    private fun createBoard(result: List<List<Int>>): List<List<String>> {
        val board = mutableListOf<List<String>>()

        for (row in result) {
            val strings = mutableListOf<String>()
            for (element in row) {
                val sb = StringBuilder()
                for (j in row.indices)
                    if (element == j) sb.append("Q")
                    else sb.append(".")
                strings.add(sb.toString())
            }

            board.add(strings)
        }

        return board
    }
}
