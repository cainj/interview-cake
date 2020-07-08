package leetcode.challenge.july

class IslandPerimeter {

    fun islandPerimeter(grid: Array<IntArray>): Int {
        var perimeter = 0
        for (row in grid.indices)
            for (col in grid[0].indices)
                if (grid[row][col] == 1) perimeter += countCorners(row, col, grid)
        return perimeter
    }


    private fun countCorners(row: Int, col: Int, grid: Array<IntArray>): Int {
        val directions = listOf(row to 1 + col, row to col - 1, row + 1 to col, row - 1 to col)
        return directions.count {
            (it.first < 0
                    || it.second < 0
                    || it.first >= grid.size
                    || it.second >= grid[0].size
                    || grid[it.first][it.second] == 0)
        }
    }
}
