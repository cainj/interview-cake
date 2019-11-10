package geeksforgeeks

import java.util.*


typealias Maze = Array<Array<Int>>
typealias Move = Pair<Char, Cell>
typealias Moves = List<Move>

fun ratInMaze(startPos: Cell, goal: Cell, maze: Maze): List<Moves> {
    return bfs(startPos, goal, maze)
}

private fun dfs(cell: Cell, goal: Cell, maze: Maze, visited: Set<Cell>, moves: Moves): List<Moves> {
    return when (goal) {
        moves.last().second -> listOf(moves)
        else -> {
            cell.legalMoves(maze).filterNot { visited.contains(it.second) }.map { move ->
                dfs(move.second, goal, maze, visited + move.second, moves + move)
            }.flatten()
        }
    }
}


private fun bfs(
    startPos: Cell,
    goal: Cell,
    maze: Maze
): MutableList<Moves> {
    val solution = mutableListOf<Moves>()
    val queue = ArrayDeque<Moves>()
    val visited = mutableSetOf(startPos)
    queue.offer(listOf(Pair('X', startPos)))

    while (queue.isNotEmpty()) {
        val moves = queue.remove()
        val move = moves.last()
        if (move.second == goal) {
            solution.add(moves)
        } else
            move.second.legalMoves(maze).filterNot { pair ->
                visited.contains(pair.second)
            }.forEach {
                queue.add(moves + it)
                visited.add(it.second)
            }
    }

    return solution
}


data class Cell(val x: Int, val y: Int) {

    fun legalMoves(maze: Maze): Moves =
        moves(this).filter {
            try {
                maze[it.second.y][it.second.x] != 0
            } catch (e: IndexOutOfBoundsException) {
                false
            }
        }

    companion object {

        fun moves(cell: Cell): Moves =
            listOf(
                Pair('D', cell.copy(x = cell.x, y = cell.y + 1)),
                Pair('U', cell.copy(x = cell.x, y = cell.y - 1)),
                Pair('R', cell.copy(x = cell.x + 1, y = cell.y)),
                Pair('L', cell.copy(x = cell.x - 1, y = cell.y))
            )
    }
}

fun printMoves(listOfMoves: List<Moves>) =
    listOfMoves.map { list ->
        list.takeLast(list.size - 1)
            .joinToString { "${it.first}" }
    }

fun main() {
    val maze = arrayOf(
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 0, 1),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 1, 1, 1)
    )
    val route = printMoves(ratInMaze(Cell(0, 0), Cell(3, 3), maze = maze))
    println(route)

}
