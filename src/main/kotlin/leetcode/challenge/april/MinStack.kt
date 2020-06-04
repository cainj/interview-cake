package leetcode.challenge.april

import java.util.*
import kotlin.math.min

class MinStack {

    /** initialize your data structure here. */
    private var stack = LinkedList<Pair<Int, Int>>()

    fun push(x: Int) = stack.push(x to min(x, min()))

    fun pop() = stack.pop().first

    fun top(): Int = stack.peek().first

    fun min(): Int =
        if (stack.isEmpty())
            Int.MAX_VALUE
        else
            stack.peek().second
}
