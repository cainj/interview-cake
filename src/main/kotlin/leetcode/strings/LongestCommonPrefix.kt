package leetcode.strings

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        if (strs.size == 1) strs[0]

        var prefix = strs[0]
        for (i in 1 until strs.size) {

            val next = strs[i]
            var j = 0
            val sb = StringBuilder()

            while (j < prefix.length && j < next.length) {
                if (prefix[j] == next[j]) sb.append(prefix[j])
                else break
                j++
            }

            prefix = sb.toString()
            if (prefix.isEmpty()) break
        }
        return prefix
    }
}
