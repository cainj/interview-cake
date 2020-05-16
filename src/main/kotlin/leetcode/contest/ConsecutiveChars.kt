package leetcode.contest

import kotlin.math.max

class ConsecutiveChars {
    fun maxPower(s: String): Int {
        var x: Char? = null
        var count = 1
        var ans = 0
        for (c in s) {
            if (x != c) {
                x = c
                count = 1
            } else count++
            ans = max(ans, count)
        }
        return ans
    }
}
