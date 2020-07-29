package leetcode

import kotlin.math.pow

class ExcelTitleColumn {

    fun titleToNumber(s: String): Int {
        var i = 0.0
        var result = 0.0
        for (x in s.length - 1 downTo 0) {
            val c = 26.0.pow(i) * ((s[x] - 'A' + 1) % 27)
            result += c
            i++
        }


        return result.toInt()
    }
}
