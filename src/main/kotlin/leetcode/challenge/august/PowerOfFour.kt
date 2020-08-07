package leetcode.challenge.august

class PowerOfFour {

    fun isPowerOfFour(num: Int): Boolean =
        when {
            num == 1 -> true
            num % 4 != 0 -> false
            num == 4 -> true
            num < 4 -> false
            else -> isPowerOfFour(num / 4)
        }
}
