package leetcode.queues

import java.util.*

class Queue2Stacks {

    /** Initialize your data structure here. */
    private val consume = LinkedList<Int>()
    private val out = LinkedList<Int>()


    /** Push element x to the back of queue. */
    fun enqueue(x: Int) = consume.push(x)

    /** Removes the element from in front of queue and returns that element. */
    fun deque(): Int {
        reverse()
        return out.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        reverse()
        return out.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean = consume.isEmpty() && out.isEmpty()

    private fun reverse() {
        if (out.isEmpty())
            while (consume.isNotEmpty())
                out.push(consume.pop())
    }
}
