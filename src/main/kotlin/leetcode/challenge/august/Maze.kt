package leetcode.challenge.august

import java.util.*

class Maze {

    private val visited = hashSetOf<Pair<Int, Int>>()

    fun hasPath(maze: Array<IntArray>, start: IntArray, destination: IntArray): Boolean {
        visited.add(start[0] to start[1])
        if (start[0] == destination[0] && start[1] == destination[1]) return true

        for ((row, col) in possibleMoves(start[0], start[1], maze))
            if (!visited.contains(row to col))
                if (hasPath(maze, intArrayOf(row, col), destination)) return true

        return false
    }

    fun bfsHasPath(maze: Array<IntArray>, start: IntArray, destination: IntArray): Boolean {
        val queue = LinkedList<Pair<Int, Int>>()
        queue.offer(start[0] to start[1])

        while(queue.isNotEmpty()){
            val (row, col) = queue.poll()
            visited.add(row to col)

            if(destination[0] == row && destination[1] == col) return true

            for(cell in possibleMoves(row, col, maze)){
                if(!visited.contains(cell)) queue.offer(cell)
            }
        }

        return false
    }

    private fun possibleMoves(row: Int, col: Int, maze: Array<IntArray>): List<Pair<Int, Int>> {
        val moves = mutableListOf<Pair<Int, Int>>()

        //left
        var left = col
        for (i in col - 1 downTo 0) {
            if (maze[row][i] == 1) break
            left = i
        }
        moves.add(row to left)

        //right
        var right = col
        for (i in col + 1 until maze[0].size) {
            if (maze[row][i] == 1) break
            right = i
        }
        moves.add(row to right)

        //up
        var up = row
        for (i in row + 1 until maze.size) {
            if (maze[i][col] == 1) break
            up = i
        }
        moves.add(up to col)

        //down
        var down = row
        for (i in row - 1 downTo 0) {
            if (maze[i][col] == 1) break
            down = i
        }
        moves.add(down to col)

        return moves
    }
}
