package leetcode.arrays

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        //edge case all '9's
        if (digits.all { it == 9 }) {
            val ans = IntArray(digits.size + 1) { 0 }
            ans[0] = 1
            return ans
        }

        var carryOver = 0
        for (i in digits.size - 1 downTo 0) {
            val d = if (i == digits.size - 1) digits[i] + 1 else digits[i] + carryOver
            digits[i] = d % 10
            carryOver = if (d > 9) 1 else 0
        }

        return digits
    }
}
