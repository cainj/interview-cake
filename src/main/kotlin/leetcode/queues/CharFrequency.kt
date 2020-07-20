package leetcode.queues

import java.util.*
import kotlin.Comparator

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 * Input:
 * "tree"
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 *
 * Example 2:
 * Input:
 * "cccaaa"
 * Output:
 * "cccaaa"
 *
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 *
 * Example 3:
 * Input:
 * "Aabb"
 * Output:
 * "bbAa"
 *
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 */
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
