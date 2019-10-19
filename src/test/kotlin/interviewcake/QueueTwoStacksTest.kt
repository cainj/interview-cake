package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class QueueTwoStacksTest {

    @Test
    fun basicQueueOperationsTest() {
        val q = QueueTwoStacks()
        q.enqueue(1)
        q.enqueue(2)
        q.enqueue(3)
        assertEquals(1, q.dequeue(), "dequeue #1")
        assertEquals(2, q.dequeue(), "dequeue #2")
        q.enqueue(4)
        assertEquals(3, q.dequeue(), "dequeue #3")
        assertEquals(4, q.dequeue(), "dequeue #4")
    }

    @Test
    fun exceptionWhenDequeueFromNewQueueTest() {
        val q = QueueTwoStacks()
        Assertions.assertThrows(Exception::class.java) { q.dequeue() }
    }

    @Test
    fun exceptionWhenDequeueFromEmptyQueueTest() {
        val q = QueueTwoStacks()
        q.enqueue(1)
        q.enqueue(2)
        q.dequeue()
        q.dequeue()
        Assertions.assertThrows(Exception::class.java) { q.dequeue() }
    }

}