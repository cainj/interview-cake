package leetcode.stacks

import java.util.*

class DecodeString {

    fun decodeString(s: String): String {
        var ans = StringBuilder()
        var countStack = LinkedList<Int>()
        val result = LinkedList<String>()

        //take the end of the string and work towards the begining
        var i = 0

        while (i < s.length) {
            var c = s[i]

            when {
                Character.isDigit(c) -> {
                    var count = 0
                    while (Character.isDigit(c)) {
                        count = 10 * count + (c - '0')
                        i++
                        c = s[i]
                    }
                    countStack.push(count)
                }
                c == ']' -> {
                    val sb = StringBuilder(result.pop())
                    for (x in 1..countStack.pop())
                        sb.append(ans)
                    ans = sb
                    i++
                }
                c == '[' -> {
                    result.push(ans.toString())
                    ans = StringBuilder()
                    i++
                }
                else -> {
                    ans.append(c)
                    i++
                }
            }
        }

        return ans.toString()
    }
}
