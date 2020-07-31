package leetcode

class FactoringTrailingZeroes {

    fun trailingZeroes(n: Int): Int {
        var result = 0
        var currentMultiple = 5L

        while (n >= currentMultiple) {
            result += (n / currentMultiple).toInt()
            currentMultiple *= 5
        }

        return result
    }
}
