package leetcode.challenge.june

class PowerOfTwo {

    fun isPowerOfTwo(n: Int): Boolean =
        when {
            n == 0 -> false
            n == 1 -> true
            n % 2 == 1 -> false
            else -> isPowerOfTwo(n / 2)
        }
}
