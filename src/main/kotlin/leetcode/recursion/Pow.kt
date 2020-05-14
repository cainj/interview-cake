package leetcode.recursion

class Pow {

    fun myPow(x: Double, n: Int): Double =
        if (n < 0) helper(1 / x, -n.toLong())
        else helper(x, n.toLong())

    private fun helper(x: Double, n: Long): Double {
        if (n == 0L) return 1.0

        val half = helper(x, n / 2)

        return if (n % 2 == 0L)
            half * half
        else
            half * half * x
    }
}
