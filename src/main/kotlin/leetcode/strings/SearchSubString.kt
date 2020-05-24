package leetcode.strings

class SearchSubString {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        var j = 0
        var i = 0
        while (i != haystack.length) {
            if (haystack[i++] == needle[j])
                if (++j == needle.length) return i - j
                else {
                    i -= j
                    j = 0
                }
        }

        return -1
    }
}
