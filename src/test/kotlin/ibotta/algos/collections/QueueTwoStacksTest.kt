package ibotta.algos.collections

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class QueueTwoStacksTest {

    @Test
    fun basicOperations() {
        val queue = QueueTwoStacks<Int>()
        queue.enqueue(0)
        queue.enqueue(1)
        queue.enqueue(2)

        Assertions.assertEquals(queue.peek(), 0)
        Assertions.assertEquals(queue.dequeue(), 0)
        Assertions.assertEquals(queue.peek(), 1)
        Assertions.assertEquals(queue.dequeue(), 1)
        Assertions.assertEquals(queue.dequeue(), 2)

        queue.enqueue(3)
        Assertions.assertEquals(queue.peek(), 3)
    }
}
