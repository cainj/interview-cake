package leetcode.graphtheory

import java.util.*

class MinHeightTrees {

    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        val ans = mutableListOf<Int>()
        if (n < 2) return listOf(0)

        val tree = hashMapOf<Int, List<Int>>()
        val degree = IntArray(n)

        for (edge in edges) {
            tree[edge[0]] = tree.getOrDefault(edge[0], listOf()) + edge[1]
            tree[edge[1]] = tree.getOrDefault(edge[1], listOf()) + edge[0]
            degree[edge[0]]++
            degree[edge[1]]++
        }

        val deque = ArrayDeque<Int>()
        for (i in 0 until n)
            if (degree[i] == 1)
                deque.offer(i)

        var v = n
        while (v > 2) {

            var size = deque.size

            while (size > 0) {
                val node = deque.poll()
                v--
                for (j in tree[node]!!) {
                    degree[j]--
                    if (degree[j] == 1)
                        deque.offer(j)
                }
                size--
            }
        }

        for (d in deque) ans.add(d)

        return ans
    }
}
