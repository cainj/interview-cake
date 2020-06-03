package leetcode.contest

class Prerequisites {
    fun checkIfPrerequisite(prerequisites: Array<IntArray>, queries: Array<IntArray>): BooleanArray {
        if (prerequisites.isEmpty() || prerequisites[0].isEmpty()) {
            val b = BooleanArray(queries.size)
            for (q in queries.indices) b[q] = false
        }

        val ans = BooleanArray(queries.size)

        val graph = hashMapOf<Int, MutableList<Int>>()
        for (pre in prerequisites) {
            val list = graph.getOrDefault(pre[0], mutableListOf())
            list.add(pre[1])
            graph[pre[0]] = list
        }

        for (i in queries.indices) {
            val bools = mutableListOf<Boolean>()
            findRequisites(queries[i][0], queries[i][1], graph, hashSetOf(), bools)
            ans[i] = bools.contains(true)
        }

        return ans
    }

    private fun findRequisites(
        req: Int,
        goal: Int,
        graph: HashMap<Int, MutableList<Int>>,
        visited: HashSet<Int>,
        bools: MutableList<Boolean>
    ) {
        if (graph.contains(req) && graph[req]!!.contains(goal)) bools.add(true)
        else if (graph.contains(req)) {
            val preReqs = graph[req]!!
            for (p in preReqs) {

                if (!visited.contains(p)) {
                    visited.add(p)
                    findRequisites(p, goal, graph, visited, bools)
                }
            }
        }
        bools.add(false)
    }
}
