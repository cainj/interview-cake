package leetcode.challenge

class NumberOfIslands {

    //O(4^n) Runtime complexity
    //O(M * N) Space complexity  I think???
    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0
        for (i in grid.indices)
            for (j in grid[i].indices)
                islands += search(i to j, grid)
        return islands
    }

    private fun search(pos: Pair<Int, Int>, grid: Array<CharArray>): Int {
        return when {
            pos.first < 0 || pos.first == grid.size
                    || pos.second < 0 || pos.second == grid[pos.first].size
                    || grid[pos.first][pos.second] == '0' -> 0
            else -> {
                grid[pos.first][pos.second] = '0'
                search(pos.first + 1 to pos.second, grid) //right
                search(pos.first - 1 to pos.second, grid) //left
                search(pos.first to pos.second + 1, grid) //up
                search(pos.first to pos.second - 1, grid) //down
                1
            }
        }
    }
}
