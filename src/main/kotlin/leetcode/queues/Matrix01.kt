package leetcode.queues

import java.util.*

typealias Pos = Pair<Int, Int>

class Matrix01 {

    fun updateMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val ones = findOnes(matrix)
        if (ones.isEmpty()) return matrix

        for (one in ones)
            matrix[one.first][one.second] = helper(one, matrix)

        return matrix
    }

    private fun helper(pos: Pos, matrix: Array<IntArray>): Int {
        val deque: Queue<Pos?> = LinkedList()
        deque.offer(pos)
        deque.offer(null)

        var count = 0
        val visited = hashSetOf<Pos>()

        while (deque.isNotEmpty()) {
            val node = deque.poll()
            if (node == null) {
                count++
                if (deque.peek() != null) deque.offer(null)
            } else if (matrix[node.first][node.second] == 0)
                break
            else {
                val neighbors = mutableListOf<Pos>(
                    node.first - 1 to node.second,
                    node.first + 1 to node.second,
                    node.first to node.second - 1,
                    node.first to node.second + 1
                ).filter { node ->
                    (node.first >= 0 && node.second >= 0)
                            && (node.first <= matrix.size - 1 && node.second <= matrix[0].size - 1)
                            && !visited.contains(node)
                }

                for (neighbor in neighbors) {
                    visited.add(neighbor)
                    deque.offer(neighbor)
                }
            }
        }

        return count

    }

    private fun findOnes(matrix: Array<IntArray>): List<Pos> {
        val ones = mutableListOf<Pos>()
        for (row in matrix.indices)
            for (col in matrix[0].indices)
                if (matrix[row][col] == 1)
                    ones.add(row to col)

        return ones
    }
}
