package leetcode

import leetcode.queues.MyCircularQueue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MyCircularQueueTest {

    @Test
    fun test() {
        val circularQueue = MyCircularQueue(3)
        assertEquals(3, circularQueue.size)
        assertEquals(true, circularQueue.enQueue(1))
        assertEquals(true, circularQueue.enQueue(2))
        assertEquals(true, circularQueue.enQueue(3))
        assertEquals(3, circularQueue.rear())
        assertEquals(true, circularQueue.isFull())
        assertEquals(true, circularQueue.deQueue())
        assertEquals(true, circularQueue.enQueue(4))
        assertEquals(2, circularQueue.front())
        assertEquals(3, circularQueue.size)
        assertEquals(false, circularQueue.isEmpty())
        assertEquals(true, circularQueue.deQueue())
        assertEquals(true, circularQueue.deQueue())
        assertEquals(true, circularQueue.deQueue())
        assertEquals(false, circularQueue.deQueue())
        assertEquals(true, circularQueue.isEmpty())
    }
}
