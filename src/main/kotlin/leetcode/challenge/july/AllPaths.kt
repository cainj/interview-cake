package leetcode.challenge.july

class AllPaths {
    private val ans = mutableListOf<List<Int>>()

    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        if (graph.isEmpty()) return emptyList()

        ans.clear()
        backtracking(0, graph, mutableListOf<Int>(0))
        return ans
    }

    private fun backtracking(node: Int, graph: Array<IntArray>, path: MutableList<Int>) {

        if (graph[node].isEmpty()) {
            val p = mutableListOf<Int>()
            p.addAll(path)
            ans.add(p)
        }

        for (n in graph[node]) {
            path.add(n)
            backtracking(n, graph, path)
            path.removeAt(path.size - 1)
        }
    }
}
