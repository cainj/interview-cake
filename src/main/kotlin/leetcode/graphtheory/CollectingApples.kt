package leetcode.graphtheory

class CollectingApples {

    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val graph = hashMapOf<Int, List<Int>>()
        val visited = hashSetOf<Int>()
        val apples = mutableListOf<Int>()

        for (edge in edges) {
            graph[edge[0]] = graph.getOrDefault(edge[0], listOf<Int>()) + edge[1]
            graph[edge[1]] = graph.getOrDefault(edge[1], listOf<Int>()) + edge[0]
        }

        return helper(0, visited, hasApple, graph)

    }

    private fun helper(node: Int, visited: HashSet<Int>, hasApple: List<Boolean>, graph: HashMap<Int, List<Int>>): Int {
        visited.add(node)

        var res = 0

        for (child in graph.getOrDefault(node, listOf<Int>())) {
            if (visited.contains(child)) continue
            res += helper(child, visited, hasApple, graph)
        }

        if ((res > 0 || hasApple.get(node)) && node != 0) res += 2

        return res
    }
}
