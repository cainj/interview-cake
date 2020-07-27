package leetcode.challenge.july

class AddDigits {
    fun addDigits(num: Int): Int =
        when {
            num > 0 -> 1 + (num - 1) % 9
            else -> 0
        }
}
