package leetcode.challenge.august

import kotlin.collections.HashSet
import kotlin.math.abs
import kotlin.math.pow

class ConsecutiveDiff {
    private var limit = 0
    private var ans: HashSet<Int>? = null

    fun numsSameConsecDiff(N: Int, K: Int): IntArray {
        ans = hashSetOf()
        limit = N
        for (n in 0..9) {
            if (limit == 1) ans!!.add(n)
            else findNum(n, 0, K, n)
        }

        return ans!!.toIntArray()
    }

    private fun findNum(num: Int, place: Int, K: Int, accum: Int) {
        if (limit == place) {
            if (accum >= 10.0.pow(limit - 1)) ans!!.add(accum)
            return
        }

        for (i in 0..9) {
            if (abs(num - i) == K) {
                val newAccum = if (place == 0) i else (accum * 10) + i
                findNum(i, place + 1, K, newAccum)
            }
        }
    }
}
