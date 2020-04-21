package leetcode

class MySqrt {

    fun mySqrt(x: Int): Int {
        if (x <= 1)
            return x
        var l = 0
        var r = x
        while (l < r) {
            val mid = l + (r - l) / 2
            when {
                x / mid == mid -> return x / mid
                x / mid > mid -> l = mid + 1
                else -> r = mid
            }
        }
        return r - 1
    }
}

/*
        First Pass
        var max = x.toDouble()
        var prev = max
        var max = x.toDouble()
        var prev = max

        while (max > 1) {
            max /= 2
            if (max * max == x.toDouble())
                return max.toInt()
            else if (max * max < x) {
                max = prev
                break
            }
            prev = max
        }

        for (i in max.toInt() downTo 0) {
            if (i.toDouble() * i.toDouble() == x.toDouble()
                || i.toDouble() * i.toDouble() < x)
                return i
        }

        return -1
*/
