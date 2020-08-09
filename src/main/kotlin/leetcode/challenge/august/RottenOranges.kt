package leetcode.challenge.august

import java.util.*

class RottenOranges {

    fun orangesRotting(grid: Array<IntArray>): Int {
        val rotten = findRottenOranges(grid)
        val deque: Queue<Pair<Int, Int>?> = LinkedList()
        var minutes = -1

        for (r in rotten)
            deque.offer(r)

        deque.offer(null)

        while (deque.isNotEmpty()) {
            val rottenOrange = deque.poll()
            if (rottenOrange == null) {
                minutes++
                if (deque.peek() != null) deque.offer(null)
            } else {
                for (fresh in getFreshOranges(rottenOrange, grid)) {
                    grid[fresh.first][fresh.second] = 2
                    deque.offer(fresh)
                }
            }
        }

        return if (isAllRotten(grid)) minutes else -1
    }

    private fun isAllRotten(grid: Array<IntArray>): Boolean {
        for(row in  grid.indices)
            for(col in grid[0].indices)
                if(grid[row][col] == 1) return false
        return true
    }

    private fun getFreshOranges(rotten: Pair<Int, Int>, grid: Array<IntArray>): List<Pair<Int, Int>> {
        val (r, c) = rotten
        val directions = listOf(r + 1 to c, r - 1 to c, r to c + 1, r to c - 1)
        return directions.filterNot { (r, c) ->
            (r > grid.size - 1 || c > grid[0].size - 1 || r < 0 || c < 0
                    || grid[r][c] != 1)
        }
    }


    private fun findRottenOranges(grid: Array<IntArray>): List<Pair<Int, Int>> {
        val rotten = mutableListOf<Pair<Int, Int>>()

        for (row in grid.indices)
            for (col in grid[0].indices)
                if (grid[row][col] == 2) rotten.add(row to col)

        return rotten
    }
}
