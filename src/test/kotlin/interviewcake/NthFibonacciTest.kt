package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class NthFibonacciTest {


    @Test
    fun zerothFibonacciTest() {
        val actual = fib(0)
        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun firstFibonacciTest() {
        val actual = fib(1)
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun secondFibonacciTest() {
        val actual = fib(2)
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun thirdFibonacciTest() {
        val actual = fib(3)
        val expected = 2
        assertEquals(expected, actual)
    }

    @Test
    fun fifthFibonacciTest() {
        val actual = fib(5)
        val expected = 5
        assertEquals(expected, actual)
    }

    @Test
    fun tenthFibonacciTest() {
        val actual = fib(10)
        val expected = 55
        assertEquals(expected, actual)
    }

    @Test
    fun negativeFibonacciTest() {
        Assertions.assertThrows(Exception::class.java) { fib(-1) }
    }

}