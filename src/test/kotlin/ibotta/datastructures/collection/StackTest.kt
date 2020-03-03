package ibotta.datastructures.collection

import ibotta.datastructures.collections.Stack
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun basicOperations() {
        val stack = Stack<Int>()
        Assertions.assertEquals(stack.peek(), null)
        Assertions.assertEquals(stack.pop(), null)
        stack.push(3)
        Assertions.assertEquals(stack.peek(), 3)
        Assertions.assertEquals(stack.pop(), 3)
        Assertions.assertEquals(stack.peek(), null)

        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)
        Assertions.assertEquals(stack.peek(), 4)
        Assertions.assertEquals(stack.pop(), 4)
        Assertions.assertEquals(stack.peek(), 3)
        Assertions.assertEquals(stack.pop(), 3)
        Assertions.assertEquals(stack.peek(), 2)
        Assertions.assertEquals(stack.pop(), 2)
        Assertions.assertEquals(stack.peek(), 1)
        Assertions.assertEquals(stack.pop(), 1)
    }
}