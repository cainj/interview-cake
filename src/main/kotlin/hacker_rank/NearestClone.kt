package hacker_rank

import java.util.*


typealias Graph = Array<GraphNode>

private val scanner = Scanner(System.`in`)


class GraphNode(val id: Int, val color: Long, val neighbors: HashSet<GraphNode> = hashSetOf()) {
    fun addNeighbors(node: GraphNode) = neighbors.add(node)
}

fun findStart(color: Long, graph: Graph): GraphNode = graph.find { it.color == color }!!


fun findShortest(graphNodes: Int, graphFrom: IntArray, graphTo: IntArray, ids: LongArray, `val`: Int): Int {
    // create nodes with ids
    val graph = Array(graphNodes) { GraphNode(it + 1, ids[it]) }

    //add edges
    for (index in graphTo.indices) {
        val to = graph[graphTo[index] - 1]
        val from = graph[graphFrom[index] - 1]
        to.addNeighbors(from)
        from.addNeighbors(to)
    }

    val start = findStart(`val`.toLong(), graph)
    return findShortestPathBFS(start, `val`.toLong(), start.id)
}

private fun findShortestPathBFS(node: GraphNode, color: Long, startId: Int): Int {
    // put the node onto the queue

    //while the queue is not empty
    //dequeue check to see if the goal has been hit
    //if it has not put the neighbors from the visited node onto the queue
    //add current node to the visited set

    val queue = ArrayDeque<List<GraphNode>>()
    val visited = hashSetOf<GraphNode>()

    queue.offer(listOf(node))

    while (queue.isNotEmpty()) {
        val path = queue.remove()
        val currentNode = path.last()

        if (currentNode.color == color && currentNode.id != startId)
            return path.size - 1

        currentNode.neighbors.filterNot { visited.contains(it) }.forEach {
            queue.add(path + it)
            visited.add(it)
        }
    }

    return -1
}

fun findShortestWithDFS(graphNodes: Int, graphFrom: IntArray, graphTo: IntArray, ids: LongArray, `val`: Int): Int {
    // create nodes with ids
    val graph = Array(graphNodes) { GraphNode(it + 1, ids[it]) }

    //add edges
    for (index in graphTo.indices) {
        val to = graph[graphTo[index] - 1]
        val from = graph[graphFrom[index] - 1]
        to.addNeighbors(from)
        from.addNeighbors(to)
    }

    val start = findStart(`val`.toLong(), graph)

    val path = findShortestPathDFS(setOf(start), setOf(start), `val`, start.id)
    return if (path.isNotEmpty()) path.minBy { it.size }!!.size - 1 else -1
}

fun findShortestPathDFS(path: Set<GraphNode>, visited: Set<GraphNode>, color: Int, startId: Int): List<Set<GraphNode>> {
    val node = path.last()
    if (node.color == color.toLong() && node.id != startId) {
        return listOf(path)
    }

    return node.neighbors.filter { !visited.contains(it) }.map { neighbor ->
        findShortestPathDFS(path + neighbor, visited + neighbor, color, startId)
    }.flatten()
}

fun main() {

    val graphNodesEdges = scanner.nextLine().split(" ")
    val graphNodes = Integer.parseInt(graphNodesEdges[0].trim { it <= ' ' })
    val graphEdges = Integer.parseInt(graphNodesEdges[1].trim { it <= ' ' })

    val graphFrom = IntArray(graphEdges)
    val graphTo = IntArray(graphEdges)

    for (i in 0 until graphEdges) {
        val graphFromTo = scanner.nextLine().split(" ")
        graphFrom[i] = Integer.parseInt(graphFromTo[0].trim { it <= ' ' })
        graphTo[i] = Integer.parseInt(graphFromTo[1].trim { it <= ' ' })
    }

    val ids = LongArray(graphNodes)

    val idsItems = scanner.nextLine().split(" ")
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

    for (i in 0 until graphNodes) {
        val idsItem = java.lang.Long.parseLong(idsItems[i])
        ids[i] = idsItem
    }

    val `val` = scanner.nextInt()
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")

    val ans = findShortest(graphNodes, graphFrom, graphTo, ids, `val`)

    scanner.close()

    println(ans)
}
