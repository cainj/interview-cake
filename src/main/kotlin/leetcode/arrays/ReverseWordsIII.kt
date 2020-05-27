package leetcode.arrays

class ReverseWordsIII {

    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        var i = 0

        while (i < s.length) {
            var j = i

            while (j < s.length && s[j] != ' ') j++
            if (j == s.length) j--

            val k = j
            while (i <= j) {
                if (s[j] == ' ') j--
                sb.append(s[j--])
            }

            i = k + 1
            if (i < s.length) sb.append(" ")
        }

        return sb.toString()
    }
}
