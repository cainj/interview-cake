package leetcode.stacks

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Stack2QueuesTest {


    @Test
    fun test() {
        val stack = Stack2Queues()
        stack.push(1)
        stack.push(2)
        Assertions.assertEquals(2, stack.top())
        Assertions.assertEquals(2, stack.pop())
        Assertions.assertEquals(false, stack.empty())
        Assertions.assertEquals(1, stack.pop())
        Assertions.assertEquals(true, stack.empty())
    }
}
