package leetcode.stacks

import java.util.*

class Stack2Queues {

    /** Initialize your data structure here. */
    var deque: Queue<Int> = ArrayDeque()

    /** Push element x onto stack. */
    fun push(x: Int) {
        val q: Queue<Int> = ArrayDeque()
        q.offer(x)
        while (deque.isNotEmpty())
            q.offer(deque.poll())
        deque = q
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int = deque.poll()

    /** Get the top element. */
    fun top(): Int = deque.peek()

    /** Returns whether the stack is empty. */
    fun empty(): Boolean = deque.isEmpty()
}
