package leetcode.graphtheory

class CollectingApples {

    fun minTime(edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val graph = hashMapOf<Int, List<Int>>()
        val visited = hashSetOf<Int>()

        for (edge in edges) {
            graph[edge[0]] = graph.getOrDefault(edge[0], listOf()) + edge[1]
            graph[edge[1]] = graph.getOrDefault(edge[1], listOf()) + edge[0]
        }

        return helper(0, visited, hasApple, graph)

    }

    private fun helper(node: Int, visited: HashSet<Int>, hasApple: List<Boolean>, graph: HashMap<Int, List<Int>>): Int {
        visited.add(node)

        var res = 0

        for (child in graph.getOrDefault(node, listOf())) {
            if (visited.contains(child)) continue
            res += helper(child, visited, hasApple, graph)
        }

        if ((res > 0 || hasApple[node]) && node != 0) res += 2

        return res
    }
}
