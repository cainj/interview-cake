package leetcode.challenge.july

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {

        if (digits.isEmpty()) return intArrayOf(1)

        var carry = 1
        val ans = mutableListOf<Int>()

        for (i in digits.size - 1 downTo 0) {
            val d = (digits[i] + carry)
            carry = if (d == 10) 1 else 0
            ans.add(0, d % 10)
        }

        if (ans[0] == 0) ans.add(0, 1)
        return ans.toIntArray()
    }
}
