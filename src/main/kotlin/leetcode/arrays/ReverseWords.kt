package leetcode.arrays

class ReverseWords {

    fun reverseWords(s: String): String {
        val words = s.split(" ")
        val sb = StringBuilder()

        for (i in words.size - 1 downTo 0) {
            val word = words[i]
            if (word != "" && word != " ") sb.append("$word ")
        }

        if (sb.isNotEmpty()) sb.deleteCharAt(sb.length - 1)
        return sb.toString()
    }
}
