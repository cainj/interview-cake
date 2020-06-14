package leetcode.challenge.june

import java.util.*

class CheapestPrice {

    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, K: Int): Int {

        val graph = hashMapOf<Int, List<Pair<Int, Int>>>()
        for (flight in flights)
            graph[flight[0]] = graph.getOrDefault(flight[0], emptyList()) + (flight[1] to flight[2])

        val queue = PriorityQueue(n, TripleComparator())
        queue.add(Triple(0, src, K + 1))

        while (queue.isNotEmpty()) {
            val flight = queue.poll()
            val cost = flight.first
            val stop = flight.second
            val k = flight.third

            if (dst == stop) return cost
            if (k > 0)
                for (p in graph[stop] ?: emptyList())
                    queue.add(Triple(p.second + cost, p.first, k - 1))

        }

        return -1
    }

    class TripleComparator : Comparator<Triple<Int, Int, Int>> {
        override fun compare(o1: Triple<Int, Int, Int>, o2: Triple<Int, Int, Int>): Int {
            return when {
                o1.first < o2.first -> -1
                o1.first == o2.first -> 0
                else -> 1
            }
        }
    }
}
