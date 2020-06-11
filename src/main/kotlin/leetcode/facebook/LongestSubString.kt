package leetcode.facebook

import kotlin.math.max

class LongestSubString {

    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var i = 0
        var j = i
        val substring = hashMapOf<Char, Int>()

        while (j < s.length) {
            if (substring.contains(s[j]))
                i = max(i, substring[s[j]]!!)

            max = max(max, j - i + 1)
            substring[s[j]] = j + 1
            j++
        }

        return max
    }
}
