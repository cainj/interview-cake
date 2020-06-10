package leetcode.facebook

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        //numeric 48-57
        //capital 65-90
        //lowercase 97-122
        val sb = StringBuilder()

        for (c in s)
            if (c != ' ') getChar(c, sb)

        val stripped = sb.toString()
        var start = 0
        var end = stripped.length - 1

        while (start < end)
            if (stripped[start++] != stripped[end--]) return false

        return true
    }

    private fun getChar(s: Char, sb: StringBuilder) {
        when {
            isNumber(s) || isLowerCase(s) -> sb.append(s)
            isCapital(s) -> sb.append(convert(s))
        }
    }

    private fun convert(char: Char): Char = char + 32

    private fun isNumber(c: Char): Boolean = c.toInt() in 48..57
    private fun isCapital(c: Char): Boolean = c.toInt() in 65..90
    private fun isLowerCase(c: Char): Boolean = c.toInt() in 97..122
}
