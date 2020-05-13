package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FibonacciMemoTest {

    @Test
    fun fib() {
        val fib = FibonacciMemo()
        assertEquals(0, fib.fib(0))
        assertEquals(1, fib.fib(1))
        assertEquals(1, fib.fib(2))
        assertEquals(2, fib.fib(3))
        assertEquals(832040, fib.fib(30))
    }
}
