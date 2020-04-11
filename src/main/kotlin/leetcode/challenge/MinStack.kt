package leetcode.challenge

import java.util.*
import kotlin.math.min

class MinStack {

    /** initialize your data structure here. */
    private var storage = LinkedList<Pair<Int, Int>>()

    fun push(x: Int) = storage.push(x to min(x, min()))

    fun pop() = storage.pop().first

    fun top(): Int = storage.peek().first

    fun min(): Int =
        if (storage.isEmpty())
            Int.MAX_VALUE
        else
            storage.peek().second
}
