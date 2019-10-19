package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class FindRepeatTest {

    @Test
    fun myTest() {
        val numbers = intArrayOf(1, 2, 3, 3)
        val expected = 3
        val actual = findRepeat(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun justTheRepeatedNumberTest() {
        val numbers = intArrayOf(1, 1)
        val expected = 1
        val actual = findRepeat(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun shortArrayTest() {
        val numbers = intArrayOf(1, 2, 3, 2)
        val expected = 2
        val actual = findRepeat(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun mediumArrayTest() {
        val numbers = intArrayOf(1, 2, 5, 5, 5, 5)
        val expected = 5
        val actual = findRepeat(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun longArrayTest() {
        val numbers = intArrayOf(4, 1, 4, 8, 3, 2, 7, 6, 5)
        val expected = 4
        val actual = findRepeat(numbers)
        assertEquals(expected, actual)
    }
}