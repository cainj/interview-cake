package leetcode.challenge.august

import java.util.*

class FindPermutation {

    fun findPermutation(s: String): IntArray {
        val ans = IntArray(s.length + 1)
        val stack = LinkedList<Int>()
        var j = 0

        for (i in 1..s.length) {
            if (s[i - 1] == 'I') {
                stack.push(i)
                while (stack.isNotEmpty()) ans[j++] = stack.pop()
            } else stack.push(i)
        }

        stack.push(s.length + 1)
        while (stack.isNotEmpty()) ans[j++] = stack.pop()
        return ans
    }
}
