package leetcode.binarysearch

class PerfectSquare {

    fun isPerfectSquare(num: Int): Boolean {
        if (num == 1) return true

        var left = 0.0
        var right = num.toDouble()

        while (left < right) {
            val mid = left + (right - left) / 2.0
            // println(mid)
            when {
                (mid.toInt() * mid.toInt()) == num -> return true
                mid * mid > num -> right = mid
                else -> left = mid + 1
            }
        }

        return false
    }
}
