package leetcode.challenge

import kotlin.math.min

typealias Pos = Pair<Int, Int>

class MinPathSum {

    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size - 1
        val n = grid[0].size - 1

        printGrid(grid)

        for (row in grid.indices) {
            for (column in grid[0].indices) {
                if (row == 0 && column == 0)
                    continue

                when {
                    row == 0 -> grid[row][column] += grid[row][column - 1]
                    column == 0 -> grid[row][column] += grid[row - 1][column]
                    else -> grid[row][column] = findMin(grid, row to column)
                }
            }
        }

        println("=========")
        printGrid(grid)

        return grid[m][n]
    }


    private fun findMin(grid: Array<IntArray>, pos: Pos): Int =
        listOf(pos.first to pos.second - 1, pos.first - 1 to pos.second).filterNot { p ->
            (p.first < 0 || p.second < 0)
        }.fold(Int.MAX_VALUE) { min, next ->
            min(grid[next.first][next.second] + grid[pos.first][pos.second], min)
        }


    private fun printGrid(grid: Array<IntArray>) =
        grid.forEach { println(it.joinToString { arr -> "$arr" }) }
}
