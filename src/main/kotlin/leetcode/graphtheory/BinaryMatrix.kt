package leetcode.graphtheory

@ExperimentalStdlibApi
class BinaryMatrix {

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {

        val n = grid.size - 1
        if (grid[0][0] == 1 || grid[n][n] == 1) return -1

        val start = 0 to 0
        val goal = n to n


        val deque = ArrayDeque<List<Pair<Int, Int>>>()
        val visited = hashSetOf<Pair<Int, Int>>()

        deque.addFirst(listOf(start))

        while (deque.isNotEmpty()) {
            val path = deque.first()
            val last = path.last()

            if (last == goal)
                return path.size

            for (move in availableMoves(visited, last, grid)) {
                visited.add(move)
                deque.addFirst(path + move)
            }

        }

        return -1
    }

    private fun availableMoves(
        visited: Set<Pair<Int, Int>>,
        pos: Pair<Int, Int>,
        grid: Array<IntArray>
    ): List<Pair<Int, Int>> {
        val moves =
            listOf(0 to 1, 1 to 0, 1 to 1, 1 to -1, -1 to 1).map { it.first + pos.first to it.second + pos.second }

        return moves.filter {
            val row = it.first
            val col = it.second
            (!visited.contains(it)
                    && row < grid.size && col < grid[0].size
                    && col > -1 && row > -1
                    && grid[row][col] == 0)
        }
    }
}
