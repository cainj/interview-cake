package leetcode.recursion

class ReverseString {

    //["h","e","l","l","o"]
    //"o","l","l","e","h"
    //Runtime complexity is O(n)
    //Space complexity is O(n) because of the recursion stack
    fun reverseString(s: CharArray): CharArray {
        if (s.isNotEmpty())
            help(0, s)
        return s
    }

    private fun help(i: Int, s: CharArray) {
        if (i >= s.size / 2)
            return

        val hold = s[i]
        s[i] = s[s.size - 1 - i]
        s[s.size - 1 - i] = hold
        help(i + 1, s)
    }
}
