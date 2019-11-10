package interviewcake

import java.util.*

typealias Graph = Map<String, Array<String>>
typealias Path = Set<String>

fun getPath(graph: Graph, startNode: String, endNode: String): Array<String>? {

    require(graph.containsKey(startNode) && graph.containsKey(endNode)) {
        throw Exception("Node must be in graph")
    }

    return bfsShortPath(startNode, endNode, graph)
}

private fun dfs(node: String, endNode: String, graph: Graph, path: Path): Array<String>? {

    val neighbors = graph[node].orEmpty()

    for (neighbor in neighbors.filter { !path.contains(it) }) {
        if (path.last() == endNode)
            return path.toTypedArray()
        else
            dfs(neighbor, endNode, graph, path + neighbor)
    }
    return null
}

private fun bfsShortPath(startNode: String, endNode: String, graph: Graph): Array<String>? {
    val queue = ArrayDeque<Path>()
    val startPath = hashSetOf(startNode)
    var solution: Array<String>? = null

    queue.add(startPath)

    while (queue.isNotEmpty() && solution == null) {
        val path = queue.remove()

        if (path.last() != endNode) {
            graph[path.last()]?.forEach {
                if (!path.contains(it))
                    queue.add(path + it)
            }
        } else
            solution = path.toTypedArray()
    }

    return solution
}
