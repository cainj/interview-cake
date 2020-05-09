package leetcode.queues

import java.util.*

class QueueTwoStacks {

    /** Initialize your data structure here. */
    private val `in` = LinkedList<Int>()
    private val out = LinkedList<Int>()


    /** Push element x to the back of queue. */
    fun push(x: Int) = `in`.push(x)

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        reverse()
        return out.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        reverse()
        return out.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean = `in`.isEmpty() && out.isEmpty()

    private fun reverse() {
        if (out.isEmpty())
            while (`in`.isNotEmpty())
                out.push(`in`.pop())
    }
}
