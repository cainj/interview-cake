package leetcode.challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinStackTest {

    @Test
    fun minStackTest(){
        val minStack = MinStack()

        Assertions.assertEquals(minStack.min(), Int.MAX_VALUE)

        minStack.push(1)
        minStack.push(2)
        minStack.push(3)
        minStack.push(4)

        Assertions.assertEquals(minStack.top(), 4)
        Assertions.assertEquals(minStack.min(), 1)
        Assertions.assertEquals(minStack.pop(), 4)
        Assertions.assertEquals(minStack.pop(), 3)
        minStack.push(-10)
        Assertions.assertEquals(minStack.min(), -10)
    }
}