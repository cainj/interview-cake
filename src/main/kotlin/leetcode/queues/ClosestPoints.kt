package leetcode.queues

import java.util.*

class ClosestPoints {

    fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
        val pq = PriorityQueue<Pair<Double, IntArray>>(
            compareByDescending<Pair<Double, IntArray>>({ it.first })
        )

        for (p in points) {
            val x = Math.sqrt((Math.abs(p[0] * p[0]) + Math.abs(p[1] * p[1])).toDouble())
            when {
                pq.size < K -> pq.add(x to p)
                pq.peek().first == x -> {
                    pq.add(x to p)
                    pq.poll()
                }
                pq.peek().first > x -> {
                    pq.poll()
                    pq.add(x to p)
                }
            }
        }

        val res = Array(K) { IntArray(2) }
        for (i in 0 until K)
            res[i] = pq.poll().second

        return res
    }
}


