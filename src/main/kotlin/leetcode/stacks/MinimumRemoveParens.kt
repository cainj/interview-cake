package leetcode.stacks

import java.util.*

class MinimumRemoveParens {

    fun minRemoveToMakeValid(s: String): String {
        val stack = ArrayDeque<Pair<Int, Char>>()
        val sb = StringBuilder()

        for (i in s.indices) {
            if (s[i] == '(') stack.push(i to '(')
            else if (s[i] == ')')
                if (stack.peek() != null && stack.peek().second == '(') stack.pop()
                else stack.push(i to ')')

            sb.append(s[i])
        }

        for ((i, _) in stack) sb.deleteCharAt(i)

        return sb.toString()
    }
}
