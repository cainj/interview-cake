package hackerrank.algorithms.graph_theory

import java.util.*


class Graph {

    private val adjacencyMap: HashMap<Int, List<Int>> = hashMapOf()

    fun addNodes(node: Int) {
        adjacencyMap[node] = emptyList()
    }

    fun addEdges(to: Int, from: Int) {
        var nodes = (adjacencyMap[from] ?: emptyList())
        if (!nodes.contains(to))
            adjacencyMap[from] = nodes + to
        nodes = (adjacencyMap[to] ?: emptyList())
        if (!nodes.contains(from))
            adjacencyMap[to] = nodes + from
    }

    operator fun get(start: Int): List<Int> = adjacencyMap[start] ?: emptyList()

}

fun bfs(graph: Graph, n: Int, start: Int): IntArray {
    val dequeue = ArrayDeque<List<Int>>()
    val solution = IntArray(n - 1) { -1 }
    for (target in 1..n) {
        if (target != start) {
            val visited = hashSetOf<Int>()
            dequeue.offer(listOf(start))
            while (dequeue.isNotEmpty()) {
                val nodes = dequeue.pop()
                val node = nodes.last()
                visited.add(node)
                if (node == target)
                    if (target < start)
                        solution[target - 1] = (nodes.size - 1) * 6
                    else
                        solution[target - 2] = (nodes.size - 1) * 6
                else
                    graph[node].filter { !visited.contains(it) }.forEach { dequeue.offer(nodes + it) }
            }
        }
    }
    return solution
}

fun main() {
    val scan = Scanner(System.`in`)
    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nm = scan.nextLine().split(" ")
        val n = nm[0].trim().toInt()
        val m = nm[1].trim().toInt()
        val edges = Array<Array<Int>>(m) { Array<Int>(2) { 0 } }

        for (i in 0 until m)
            edges[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val s = scan.nextLine().trim().toInt()
        val graph = Graph()
        for (i in 1 until n + 1)
            graph.addNodes(i)
        for (edge in edges)
            graph.addEdges(edge[0], edge[1])

        val result = bfs(graph, n, s)
        println(result.joinToString(" "))
    }
}
