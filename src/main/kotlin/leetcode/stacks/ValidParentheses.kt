package leetcode.stacks

import java.util.*

class ValidParentheses {

    private val stack = LinkedList<Char>()
    private val map = hashMapOf<Char, Char>(')' to '(', '}' to '{', ']' to '[')

    fun isValid(s: String): Boolean {

        for (c in s) {
            if (map.contains(c)) {
                if (map[c] != stack.peek()) return false
                stack.pop()
            } else stack.push(c)
        }

        return stack.isEmpty()
    }
}
