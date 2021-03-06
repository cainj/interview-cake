package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Queue2StacksTest {

    @Test
    fun test() {
        val queue = Queue2Stacks()
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(false, queue.empty())
        assertEquals(1, queue.deque())
        assertEquals(2, queue.peek())
        assertEquals(2, queue.deque())
        assertEquals(true, queue.empty())
    }

}
