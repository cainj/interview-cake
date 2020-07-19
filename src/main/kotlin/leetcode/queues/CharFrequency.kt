package leetcode.queues

import java.util.*
import kotlin.Comparator

class CharFrequency {

    fun frequencySort(s: String): String {
        val frequency = hashMapOf<Char, Int>()
        val sb = StringBuilder()

        for (c in s)
            frequency[c] = frequency.getOrDefault(c, 0) + 1

        val maxHeap = PriorityQueue<Pair<Char, Int>>(Comparator { a, b ->
            when {
                a.second > b.second -> -1
                a.second == b.second -> 0
                else -> 1
            }
        })


        for ((c, f) in frequency) maxHeap.add(c to f)

        while (maxHeap.isNotEmpty()) {
            val (k, v) = maxHeap.poll()
            for (i in 0 until v)
                sb.append(k)
        }

        return sb.toString()
    }
}
