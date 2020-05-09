package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class QueueTwoStacksTest {

    @Test
    fun test() {
        val queue = QueueTwoStacks()
        queue.push(1);
        queue.push(2);
        assertEquals(false, queue.empty())
        assertEquals(1, queue.pop())
        assertEquals(2, queue.peek())
        assertEquals(2, queue.pop())
        assertEquals(true, queue.empty())
    }

}
