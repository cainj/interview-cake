package leetcode.queues

import java.util.*
import kotlin.Comparator

class TopKFrequentWords {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val frequency = hashMapOf<String, Int>()
        val ans = mutableListOf<String>()

        for (word in words)
            frequency[word] = frequency.getOrDefault(word, 0) + 1

        //'val k = compareBy({it.first}).thenBy(compareBy(String.CASE_INSENSITIVE_ORDER) { p -> p.second })
        val priority = PriorityQueue<Pair<Int, String>>(Comparator { a, b ->
            when {
                a.first > b.first -> 1
                a.first == b.first -> (b.second as java.lang.String).compareToIgnoreCase(a.second)
                else -> -1
            }
        })

        for ((key, value) in frequency) {
            when {
                priority.size < k -> priority.add(value to key)
                priority.peek().first == value -> {
                    priority.add(value to key)
                    priority.poll()
                }
                priority.peek().first < value -> {
                    priority.poll()
                    priority.add(value to key)
                }
            }
        }

        while (priority.isNotEmpty())
            ans.add(0, priority.poll().second)
        return ans
    }
}
