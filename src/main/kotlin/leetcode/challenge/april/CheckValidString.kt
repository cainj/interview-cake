package leetcode.challenge.april

import java.util.*

class CheckValidString {

    //O(n) = runtime complexity
    //O(n) = space complexity
    fun checkValidString(s: String): Boolean {
        val asterisks = LinkedList<Int>()
        val leftParens = LinkedList<Int>()

        for (i in s.indices) {
            when (s[i]) {
                '(' -> leftParens.push(i)
                '*' -> asterisks.push(i)
                else -> {
                    when {
                        leftParens.isNotEmpty() -> leftParens.pop()
                        asterisks.isNotEmpty() -> asterisks.pop()
                        else -> return false
                    }
                }
            }

        }

        while (leftParens.isNotEmpty() && asterisks.isNotEmpty())
            if (leftParens.peek() < asterisks.peek()) {
                leftParens.pop()
                asterisks.pop()
            } else
                break

        return leftParens.size == 0
    }

    //O(2n) == O(n) Runtime
    //O(1) == space complexity
    fun checkValidStringPointers(s: String): Boolean {
        var balance = 0

        if (s.isEmpty())
            return true

        for (c in s) {
            if (c == '(' || c == '*')
                balance++
            else
                balance--

            if (balance < 0)
                return false
        }

        if (balance == 0)
            return true

        balance = 0
        for (c in s.reversed()) {
            if (c == ')' || c == '*')
                balance++
            else
                balance--

            if (balance < 0)
                return false
        }

        return true
    }
}
