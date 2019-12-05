package hackerrank.algorithms.graph_theory

import java.util.*

typealias Maze = Array<CharArray>

data class Tunnel(val x: Cell, val y: Cell)

data class Cell(val x: Int, val y: Int) {

    private val left = Cell(x, y - 1)
    private val right = Cell(x, y + 1)
    private val up = Cell(x - 1, y)
    private val down = Cell(x + 1, y)

    private val moves = listOf(left, right, up, down)

    fun availableMoves(maze: Maze): List<Cell> = moves.filter { move ->
        (move.y <= maze.size - 1 && move.x <= maze[y].size - 1) && !OBSTACLES.contains(maze[move.y][move.x])
    }

    companion object {
        private const val WALL = '#'
        const val ALEF = 'A'
        private const val MINE = '*'
        private const val EXIT = '%'
        val OBSTACLES = setOf(WALL, MINE)
    }

}

fun calculateProbability(start: Cell, maze: Maze): Float = TODO()

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val nmk = scan.nextLine().split(" ")
    val n = nmk[0].trim().toInt()
    val m = nmk[1].trim().toInt()
    val k = nmk[2].trim().toInt()
    val maze = Array(n) { CharArray(m) }
    val tunnels = Array<Tunnel?>(k) { null }
    for (nItr in 1..n) {
        val row = scan.nextLine()
        maze[nItr] = scan.next().toCharArray()
    }

    for (kItr in 1..k) {
        val sc = scan.nextLine().split(" ")
        val i1 = sc[0].trim().toInt()
        val j1 = sc[1].trim().toInt()
        val i2 = sc[2].trim().toInt()
        val j2 = sc[3].trim().toInt()
        // Write Your Code Here
        tunnels[kItr] = Tunnel(Cell(i1 - 1, j1 - 1), Cell(i2 - 1, j2 - 1))
    }
    // Write Your Code Here
}
