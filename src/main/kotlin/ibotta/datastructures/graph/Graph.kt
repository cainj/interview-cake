package ibotta.datastructures.graph

import java.util.*

typealias Path = List<Vertex>


class Graph(private val bidirectional: Boolean = false) {

    private val adjacencyList: HashSet<Vertex> = hashSetOf()

    /**
     * Use BFS in a unweighted graph shortest path
     */
    fun shortestPath(startId: String, goalId: String): Path {
        val dequeue = ArrayDeque<Path>()
        val visited = hashSetOf<String>()

        dequeue.add(listOf(getVertex(startId)))

        while (dequeue.isNotEmpty()) {
            val path = dequeue.remove()
            val vertex = path.last()
            visited.add(vertex.id)
            val vertices = vertex.neighbors().filterNot { visited.contains(it) }
            if (vertex.id == goalId)
                return path
            vertices.forEach { dequeue.offer(path + getVertex(it)) }
        }

        return emptyList()
    }

    /**
     * Using Dijkstra's Algorithm.  Needed help on this one, watched several tutorials
     * and borrowed a BinaryMinHeap implementation.
     */
    fun shortestDistance(startId: String, goalId: String): Pair<Int, Path> {
        val minHeap = BinaryMinHeap<Vertex>()
        val distanceMap = hashMapOf<Vertex, Int>()
        val pathMap = hashMapOf<Vertex, Vertex?>()
        adjacencyList.forEach { minHeap.add(Int.MAX_VALUE, it) }

        val source = getVertex(startId)
        minHeap.decrease(source, 0)
        distanceMap[source] = 0
        pathMap[source] = null


        while (!minHeap.empty()) {

            val node = minHeap.extractMinNode()
            val current = node.key
            distanceMap[current] = node.weight


            for (neighbor in current.neighbors()) {
                val neighborVertex = getVertex(neighbor)

                if (!minHeap.containsData(neighborVertex))
                    continue

                val newDistance = distanceMap.getOrDefault(current, 0) + getEdge(current.id, neighbor).weight

                if (minHeap.getWeight(neighborVertex)!! > newDistance) {
                    minHeap.decrease(neighborVertex, newDistance)
                    pathMap[neighborVertex] = getVertex(current.id)
                }

            }
        }
        val distance = distanceMap[getVertex(goalId)] ?: -1
        // find goal then work backwards 0(n)
        // TODO: probably could build the path while calculating the distance
        var current: Vertex? = getVertex(goalId)
        var path = emptyList<Vertex>()

        while (current != null) {
            path = listOf(current) + path
            current = pathMap[current]
        }

        return distance to path
    }

    fun addVertex(id: String) = adjacencyList.add(Vertex(id))

    fun addEdge(fromId: String, toId: String, weight: Int = 0) =
        if (bidirectional) {
            doAddEdge(fromId, toId, weight)
            doAddEdge(toId, fromId, weight)
        } else {
            doAddEdge(fromId, toId, weight)
        }

    fun getEdge(fromId: String, toId: String): Edge =
        getVertex(fromId).edges[toId] ?: error("edge from:$fromId to:$toId  found!")

    fun getVertex(id: String): Vertex = adjacencyList.find { it.id == id } ?: error("vertex $id not found!")

    private fun doAddEdge(fromId: String, toId: String, weight: Int) {
        getVertex(fromId).edges[toId] = Edge(toId, fromId, weight)
    }

}


data class Vertex(val id: String = UUID.randomUUID().toString()) {

    val edges = hashMapOf<String, Edge>()

    fun neighbors(): Set<String> = edges.keys
}

data class Edge(val to: String, val from: String, val weight: Int = 0)

fun main() {
    unweightedGraphShortestPathTest()
    weightGraphShortestPathTest()
}

fun unweightedGraphShortestPathTest() {
    val straightLine = Graph<Int>()
    (1..10).forEach { straightLine.addVertex(it.toString()) }
    straightLine.addEdge("1", "2")
    straightLine.addEdge("2", "3")
    straightLine.addEdge("3", "4")
    straightLine.addEdge("4", "5")
    straightLine.addEdge("5", "6")
    straightLine.addEdge("6", "7")
    straightLine.addEdge("7", "8")
    straightLine.addEdge("8", "9")
    straightLine.addEdge("9", "10")
    var path = straightLine.shortestPath("1", "10")
    check(path.size == 10) { "size of path is ${path.size}" }
    val edge = straightLine.getEdge("1", "2")
    check(edge.from == "1")
    check(edge.to == "2")
    check(edge.weight == 0)


    val star = Graph()
    (1..7).forEach { star.addVertex(it.toString()) }
    star.addEdge("1", "2")
    star.addEdge("1", "3")
    star.addEdge("1", "4")
    star.addEdge("1", "5")
    star.addEdge("1", "6")
    star.addEdge("1", "7")
    path = star.shortestPath("1", "5")
    check(path.size == 2)

    val vertexOne = star.getVertex("1")
    check(vertexOne.edges.size == 6)
    try {
        star.getVertex("i")
        check(false)
    } catch (ex: IllegalStateException) {
        check(true)
    }
    val vertexSeven = star.getVertex("7")
    check(vertexSeven.edges.size == 0)
}

fun weightGraphShortestPathTest() {
    val graph = Graph()
    listOf("A", "B", "C", "D", "E", "F").forEach { graph.addVertex(it) }

    graph.addEdge("A", "A", 5)
    graph.addEdge("B", "C", 2)
    graph.addEdge("A", "D", 9)
    graph.addEdge("A", "E", 3)
    graph.addEdge("E", "F", 2)
    graph.addEdge("F", "D", 2)
    graph.addEdge("C", "D", 3)

    val solution = graph.shortestDistance("A", "D")
    check(solution.first == 7)
    println(solution)
    check(solution.second.map { it.id } == listOf("A", "E", "F", "D"))

}
