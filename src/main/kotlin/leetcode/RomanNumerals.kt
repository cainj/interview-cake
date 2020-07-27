package leetcode

class RomanNumerals {
    fun romanToInt(s: String): Int {
        val romans = hashMapOf<Char, Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var result = 0

        var prev = ' '
        for (i in s.indices) {
            val c = s[i]

            result += if (c == 'V' && prev == 'I')
                3
            else if (c == 'X' && prev == 'I')
                8
            else if (c == 'L' && prev == 'X')
                30
            else if (c == 'C' && prev == 'X')
                80
            else if (c == 'D' && prev == 'C')
                300
            else if (c == 'M' && prev == 'C')
                800
            else romans[c]!!
            prev = c
        }

        return result
    }
}
