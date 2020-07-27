package leetcode

class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {

        var length = 0
        for (i in s.length - 1 downTo 0)
            if (s[i] != ' ') length++
            else if (s[i] == ' ' && length == 0) continue
            else break;

        return length
    }
}
