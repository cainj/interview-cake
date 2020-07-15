package leetcode.facebook

import java.util.*

class ShortestDistance {

    private val rowDir = intArrayOf(0, 0, 1, -1)
    private val colDir = intArrayOf(1, -1, 0, 0)

    fun shortestDistance(grid: Array<IntArray>): Int {

        if (grid.isEmpty()) return -1

        val reach = Array(grid.size) { IntArray(grid[0].size) }
        val dist = Array(grid.size) { IntArray(grid[0].size) }

        var totalBuildings = 0
        for (row in grid.indices)
            for (col in grid[0].indices)
                if (grid[row][col] == 1) {
                    findShortestDistance(grid, row, col, reach, dist)
                    totalBuildings++
                }

        var min = Int.MAX_VALUE

        for (row in grid.indices)
            for (col in grid[0].indices)
                if (reach[row][col] == totalBuildings && dist[row][col] < min)
                    min = dist[row][col]

        return if (min == Int.MAX_VALUE) -1 else min
    }

    private fun findShortestDistance(
        grid: Array<IntArray>,
        row: Int,
        col: Int,
        reach: Array<IntArray>,
        dist: Array<IntArray>
    ) {

        val deque = ArrayDeque<IntArray>()
        deque.offer(intArrayOf(row, col))
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        visited[row][col]

        var distance = 0
        while (deque.isNotEmpty()) {
            val size = deque.size
            distance++
            for (i in 0 until size) {
                val pos = deque.poll()

                for (k in 0 until 4) {
                    val r = pos[0] + rowDir[k]
                    val c = pos[1] + colDir[k]

                    if (!isValid(grid, r, c, visited)) continue
                    reach[r][c]++
                    dist[r][c] += distance
                    visited[r][c] = true
                    deque.offer(intArrayOf(r, c))
                }
            }
        }
    }

    private fun isValid(grid: Array<IntArray>, row: Int, col: Int, visited: Array<BooleanArray>): Boolean =
        !(row > grid.size - 1 || row < 0
                || col > grid[0].size - 1 || col < 0
                || grid[row][col] != 0
                || visited[row][col])

}
