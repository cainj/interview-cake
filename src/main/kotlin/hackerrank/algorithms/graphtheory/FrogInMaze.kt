package hackerrank.algorithms.graphtheory

import java.util.*

typealias Maze = Array<CharArray>
typealias Tunnels = Array<Tunnel?>

data class Tunnel(val a: Cell, val b: Cell)

data class Cell(val x: Int, val y: Int) {

    private fun moves() =
        listOf(
            Cell(x, y - 1),
            Cell(x, y + 1),
            Cell(x - 1, y), Cell(x + 1, y)
        )

    fun availableMoves(maze: Maze, tunnels: Tunnels): List<Cell> {

        return moves().fold(listOf()) { accum, move ->
            if (inBounds(move, maze) && maze[move.y][move.x] != WALL) {
                val tunnel = inTunnel(move, tunnels)
                when (tunnel != null) {
                    true -> {
                        if (tunnel.a == move)
                            accum + tunnel.b
                        else
                            accum + tunnel.a
                    }
                    false -> accum + move
                }
            } else
                accum
        }
    }

    private fun inBounds(move: Cell, maze: Maze) =
        (move.y <= maze.size - 1 && move.x <= maze[y].size - 1) && (move.x > -1 && move.y > -1)

    companion object {
        const val ALEF = 'A'
        const val EXIT = '%'
        private const val WALL = '#'
        const val MINE = '*'
    }
}

fun inTunnel(c: Cell, tunnels: Tunnels): Tunnel? = tunnels.find { t -> t?.a == c || t?.b == c }

/**
 * Find the frog
 */
fun findAlef(maze: Array<CharArray>): Cell {
    for (i in maze.indices) {
        for (j in maze[i].indices)
            if (maze[i][j] == Cell.ALEF)
                return Cell(j, i)
    }
    throw IllegalStateException("Couldn't find Alef")
}

var trapped = 0.0
var exit = 0.0

fun calculateProbability(cell: Cell, maze: Maze, tunnels: Tunnels, visited: Set<Cell>) {
    when {
        Cell.MINE == maze[cell.y][cell.x] -> trapped++
        Cell.EXIT == maze[cell.y][cell.x] -> exit++
        else -> {
            val moves = cell.availableMoves(maze, tunnels).filter { !visited.contains(it) }
            if (moves.isEmpty()) trapped++
            else
                for (move in moves)
                    calculateProbability(move, maze, tunnels, visited + move)
        }
    }

}

private val scanner: Scanner = Scanner(System.`in`)

fun main() {
    val nmk: Array<String> = scanner.nextLine().split(" ").toTypedArray()
    val n = nmk[0].toInt()
    val m = nmk[1].toInt()
    val k = nmk[2].toInt()
    val maze = Array(n) { CharArray(m) }
    val tunnels = Array<Tunnel?>(k) { null }

    for (nItr in 0 until n) {
        val row: String = scanner.nextLine()
        maze[nItr] = row.toCharArray()
    }
    for (kItr in 0 until k) {
        val i1J1I2J2: Array<String> = scanner.nextLine().split(" ").toTypedArray()
        val i1 = i1J1I2J2[0].toInt()
        val j1 = i1J1I2J2[1].toInt()
        val i2 = i1J1I2J2[2].toInt()
        val j2 = i1J1I2J2[3].toInt()
        tunnels[kItr] = Tunnel(Cell(j1 - 1, i1 - 1), Cell(j2 - 1, i2 - 1))
    }

    val alef = findAlef(maze)
    calculateProbability(alef, maze, tunnels, setOf(alef))
    val probability: Double = if (trapped + exit == 0.0) 0.0 else exit / (trapped + exit)
    println(probability)
}
