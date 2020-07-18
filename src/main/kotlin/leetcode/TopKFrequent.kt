package leetcode

import java.util.*
import kotlin.Comparator

class TopKFrequent {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val countMap = hashMapOf<Int, Int>()

        for (num in nums)
            countMap[num] = countMap.getOrDefault(num, 0) + 1

        val heap = PriorityQueue<Int>(Comparator { a, b ->
            countMap[a]!! - countMap[b]!!
        })

        for ((n, _) in countMap) {
            heap.add(n)
            if (heap.size > k) heap.poll()
        }

        val ans = IntArray(k)

        for (i in 0 until k)
            ans[i] = heap.poll()

        return ans

    }
}
