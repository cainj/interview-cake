package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class HighProductOf3Test {
    @Test
    fun shortArrayTest() {
        val actual = highestProductOf3(intArrayOf(1, 2, 3, 4))
        val expected = 24
        assertEquals(expected, actual)
    }

    @Test
    fun longerArrayTest() {
        val actual = highestProductOf3(intArrayOf(6, 1, 3, 5, 7, 8, 2))
        val expected = 336
        assertEquals(expected, actual)
    }

    @Test
    fun arrayHasOneNegativeTest() {
        val actual = highestProductOf3(intArrayOf(-5, 4, 8, 2, 3))
        val expected = 96
        assertEquals(expected, actual)
    }

    @Test
    fun arrayHasTwoNegativesTest() {
        val actual = highestProductOf3(intArrayOf(-10, 1, 3, 2, -10))
        val expected = 300
        assertEquals(expected, actual)
    }

    @Test
    fun arrayIsAllNegativesTest() {
        val actual = highestProductOf3(intArrayOf(-5, -1, -3, -2))
        val expected = -6
        assertEquals(expected, actual)
    }

    @Test
    fun exceptionWithEmptyArrayTest() {
        assertThrows(Exception::class.java) { highestProductOf3(intArrayOf()) }
    }

    @Test
    fun exceptionWithOneNumberTest() {
        assertThrows(Exception::class.java) { highestProductOf3(intArrayOf(1)) }
    }

    @Test
    fun exceptionWithTwoNumbersTest() {
        assertThrows(Exception::class.java) { highestProductOf3(intArrayOf(1, 1)) }
    }

}