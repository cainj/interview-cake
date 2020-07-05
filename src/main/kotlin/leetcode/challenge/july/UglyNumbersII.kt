package leetcode.challenge.july

import kotlin.math.min

class UglyNumbersII {

    //2 - 2, 4, 6, 8, 10
    //3 - 3, 6, 9, 12
    //5 - 5, 10, 15, 20
    fun nthUglyNumber(n: Int): Int {
        val numbers = mutableListOf(1)
        var i = 0
        var j = i
        var k = j

        while (numbers.size < n) {
            val twos = numbers[i] * 2
            val threes = numbers[j] * 3
            val fives = numbers[k] * 5

            val min = min(twos, min(threes, fives))

            if (min == twos) i++
            if (min == threes) j++
            if (min == fives) k++

            numbers.add(min)
        }

        return numbers[n - 1]
    }
}
