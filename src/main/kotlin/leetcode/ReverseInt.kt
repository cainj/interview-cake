package leetcode

import kotlin.math.abs

class ReverseInt {
    fun reverse(x: Int): Int {
        var i = abs(x)
        var m = 0

        while (i > 0) {
            val pop = (i % 10)
            if (m > Int.MAX_VALUE / 10) return 0

            m = m * 10 + pop
            i /= 10
        }

        return if (x < 0) m * -1 else m
    }
}
