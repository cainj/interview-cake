package leetcode.contest

import java.util.*
import kotlin.Comparator

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
