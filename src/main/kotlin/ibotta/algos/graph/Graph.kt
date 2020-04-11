package ibotta.algos.graph

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
