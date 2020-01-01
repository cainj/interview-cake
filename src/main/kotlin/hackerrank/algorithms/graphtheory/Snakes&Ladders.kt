package hackerrank.algorithms.graphtheory

import java.util.*

class GameGraph(ladders: Array<Array<Int>>, snakes: Array<Array<Int>>) {

    private val adjacencyMap = hashMapOf<Int, List<Int>>()

    init {
        createGraph(ladders, snakes)
    }

    private fun addNode(node: Int) {
        adjacencyMap[node] = emptyList()
    }

    private fun addEdges(to: Int, from: Int) {
        val nodes = (adjacencyMap[from] ?: emptyList())
        if (!nodes.contains(to))
            adjacencyMap[from] = nodes + to
    }

    private fun createGraph(ladders: Array<Array<Int>>, snakes: Array<Array<Int>>) {

        for (i in RANGE)
            if (ladders.find { it[0] == i } == null && snakes.find { it[0] == i } == null)
                addNode(i)

        for (i in adjacencyMap.keys)
            for (dice in 1..6) {
                val edge = dice + i
                val ladder = ladders.find { it[0] == edge }
                val snake = snakes.find { it[0] == edge }
                if (edge <= GOAL) {
                    when {
                        ladder != null -> addEdges(ladder[1], i)
                        snake != null -> addEdges(snake[1], i)
                        else -> addEdges(edge, i)
                    }
                }
            }
    }

    fun findEdges(value: Int) = adjacencyMap[value]
}

fun Int.nextMove(graph: GameGraph): List<Int> = graph.findEdges(this) ?: emptyList()

private const val START = 1
private const val GOAL = 100
private val RANGE = 1..99

fun quickestWayUp(ladders: Array<Array<Int>>, snakes: Array<Array<Int>>): Int {
    // This is a graph theory problem and we want to find the quickest way from 1 to 100.
    // Naturally sounds like BFS would be the best approach to the problem.  If we want the quickest path.
    // You can solve by constructing an AdjacencyList with vertices and edges.  This graph is DAG.
    // Starting position is always 0

    var solution = -1

    val graph = GameGraph(ladders, snakes)

    val dequeue = ArrayDeque<List<Int>>()
    val visited = hashSetOf(START)
    dequeue.offer(listOf(START))

    while (dequeue.size != 0 && solution == -1) {
        val path = dequeue.remove()
        val currentPos = path.last()

        if (currentPos == GOAL)
            solution = path.size - 1
        else {
            val neighbors = currentPos.nextMove(graph).filterNot { visited.contains(it) }
            neighbors.forEach { neighbor ->
                visited.add(neighbor)
                dequeue.offer(path + neighbor)
            }
        }
    }

    return solution
}

fun main() {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()
        val ladders = Array(n) { Array(2) { 0 } }
        for (i in 0 until n) {
            ladders[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        }

        val m = scan.nextLine().trim().toInt()
        val snakes = Array(m) { Array(2) { 0 } }

        for (i in 0 until m) {
            snakes[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        }

        ladders.sortBy { it[0] }
        snakes.sortByDescending { it[0] }
        val result = quickestWayUp(ladders, snakes)
        println(result)
    }
}
