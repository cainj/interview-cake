package leetcode.challenge.june

class ReverseString {

    //Space O(1)
    //Runtime O(n)
    fun reverseString(s: CharArray) {
        var start = 0
        var end = s.size - 1

        while (start < end) {
            val hold = s[start]
            s[start++] = s[end]
            s[end--] = hold
        }
    }
}
