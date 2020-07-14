package leetcode.contest

import java.util.*
import kotlin.Comparator

/**
 * You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list
 * where edges(i) = [a, b] is an undirected edge connecting the nodes a and b with a probability of success
 * of traversing that edge succProb(i).
 *
 * Given two nodes start and end, find the path with the maximum probability of success to go from start to
 * end and return its success probability.
 * If there is no path from start to end, return 0.
 *
 *
 * Example 1:
 *         (0)
 *         / \
 *    .5  /   \ .2
 *       /     \
 *     (1)-----(2)
 *         .5
 *
 * Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
 * Output: 0.25000
 * Explanation: There are two paths from start to end, one having a probability of success = 0.2
 * and the other has 0.5 * 0.5 = 0.25.
 *
 *
 * Example 2:
 *
 *         (0)
 *         / \
 *    .5  /   \ .3
 *       /     \
 *     (1)-----(2)
 *         .5
 * Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
 * Output: 0.30000
 *
 * Example 3:
 *           0
 *          /
 *      .5 /
 *        /
 *       1        [2]
 *
 * Input: n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
 * Output: 0.00000
 * Explanation: There is no path between 0 and 2.
 *
 * Constraints:
 * 2 <= n <= 100
 * 0 <= start, end < n
 * start != end
 * 0 <= a, b < n
 * a != b
 * succProb.length == edges.length
 * 0 <= succProb[i] <= 1
 * There is at most one edge between every two nodes.
 */
class MaximumProbability {

    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start: Int, end: Int): Double {
        val graph = hashMapOf<Int, List<Edge>>()
        for (i in edges.indices) {
            graph[edges[i][0]] = graph.getOrDefault(edges[i][0], listOf()) + Edge(edges[i][0], edges[i][1], succProb[i])
            graph[edges[i][1]] = graph.getOrDefault(edges[i][1], listOf()) + Edge(edges[i][1], edges[i][0], succProb[i])
        }

        val visited = hashMapOf(start to 1.0)
        val deque = PriorityQueue<Edge>(EdgeComparator())

        for (p in graph[start] ?: emptyList())
            deque.offer(p)

        while (deque.isNotEmpty()) {
            val edge = deque.poll()

            if (visited.containsKey(edge.end)) continue
            visited[edge.end] = edge.prob
            if (edge.end == end) return visited[end]!!

            for (next in graph[edge.end] ?: emptyList())
                deque.offer(Edge(edge.start, next.end, edge.prob * next.prob))
        }

        return 0.0
    }

    data class Edge(val start: Int, val end: Int, val prob: Double)

    class EdgeComparator : Comparator<Edge> {
        override fun compare(o1: Edge, o2: Edge): Int {
            return when {
                o1.prob > o2.prob -> -1
                o1.prob == o2.prob -> 0
                else -> 1
            }
        }
    }
}
