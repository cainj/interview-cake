package interviewcake

import java.util.*

/**
 * for (char in characters)
 * if(char is an opener)
 *   then push onto stack
 * else if(char is a closer)
 *   then match the closer with the head of the stack to make sure they are opposites
 *   if( closer != opener opposite)
 *      then return false
 */
fun isValid(code: String): Boolean {
    try {
        val closerMap = mapOf(')' to '(', '}' to '{', ']' to '[')
        val openers = closerMap.values
        val closers = closerMap.keys
        val stack = ArrayDeque<Char>()
        val verticalBar = '|'
        var verticalMode = false

        for (char in code.toCharArray()) {
            if (openers.contains(char))
                stack.push(char)
            else if (closers.contains(char)) {
                val head = stack.pop()
                if (head != closerMap[char])
                    return false
            } else if (verticalBar == char) {
                verticalMode =
                    if (!verticalMode) {
                        stack.push(char)
                        true
                    } else if (stack.pop() != verticalBar) {
                        return false
                    } else
                        false
            }

        }
        return stack.size == 0
    } catch (e: NoSuchElementException) {
        return false
    }
}
