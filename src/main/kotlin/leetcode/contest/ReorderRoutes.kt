package leetcode.contest

import kotlin.math.abs

class ReorderRoutes {
    private var ans: Int = 0

    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        ans = 0

        if (connections.isEmpty() || connections[0].isEmpty()) return 0

        val graph = hashMapOf<Int, List<Int>>()

        for (connection in connections) {
            graph[connection[0]] = graph.getOrDefault(connection[0], emptyList()) + connection[1]
            graph[connection[1]] = graph.getOrDefault(connection[1], emptyList()) + (-connection[0])
        }

        reorder(graph, 0)
        return ans
    }

    private fun reorder(graph: Map<Int, List<Int>>, city: Int, visited: HashSet<Int> = hashSetOf<Int>()) {
        if (!visited.add(abs(city))) return
        if (city > 0) ans++
        for (next in graph.getOrDefault(abs(city), emptyList())) {
            reorder(graph, next, visited)
        }
    }
}
