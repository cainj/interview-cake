package leetcode.strings

class ReverseString {

    fun reverseString(s: CharArray) {
        var begin = 0
        var end = s.size - 1

        while (begin < end) {
            val hold = s[begin]
            s[begin] = s[end]
            s[end] = hold
            begin++
            end--
        }
    }
}
