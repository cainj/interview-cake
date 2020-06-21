package leetcode.contest

import java.util.*

class AvoidFlood {

    fun avoidFlood(rains: IntArray): IntArray {
        val lakes = hashMapOf<Int, Int>()
        val ans = IntArray(rains.size)
        val dry = TreeSet<Int>()

        for (i in rains.indices) {
            if (rains[i] > 0) {
                ans[i] = -1
                if (lakes.containsKey(rains[i])) {
                    val ceiling = dry.ceiling(lakes[rains[i]]!!)
                    if (ceiling != null) {
                        dry.remove(ceiling)
                        ans[ceiling] = rains[i]
                    } else return intArrayOf()
                }
                lakes[rains[i]] = i
            } else dry.add(i)
        }

        for (empty in dry) ans[empty] = 1

        return ans
    }
}
