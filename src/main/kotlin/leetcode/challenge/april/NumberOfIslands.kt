package leetcode.challenge.april

/**
 * Given a 2d grid map of '1's (land) and '0's (water),
 * count the number of islands. An island is surrounded by water
 * and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are
 * all surrounded by water.
 *
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * Output: 1
 *
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * Output: 3
 */
class NumberOfIslands {

    //O(M * N) Runtime complexity
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
