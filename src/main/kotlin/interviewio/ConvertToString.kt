package interviewio

class ConvertToString {

    fun convertString(str: String): List<Int> {
        var num = ""
        val ans = mutableListOf<Int>()
        var flag = false

        for (c in str) {
            if (c == '-' || c - '0' in 0..9) {
                if (!flag && '0' == c) continue
                else if (!flag) flag = true
                num += c
            } else if (flag) {
                ans.add(convert(num))
                flag = false
                num = ""
            }
        }

        if (flag) ans.add(convert(num))
        return ans
    }

    private fun convert(str: String): Int {
        val n = if (str[0] == '-') 1 else 0
        var x = str[n] - '0'
        for (i in (n + 1) until str.length)
            x = x * 10 + (str[i] - '0') % 10

        return if (n == 1) -1 * x else x
    }
}
