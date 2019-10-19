package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class FindDuplicateTest {

    @Test
    fun myTest() {
        val numbers = arrayOf(2, 3, 1, 3)
        val expected = 3
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun justTheRepeatedNumberTest() {
        val numbers = arrayOf(1, 1)
        val expected = 1
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun shortArrayTest() {
        val numbers = arrayOf(1, 2, 3, 2)
        val expected = 2
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun longArrayTest() {
        val numbers = arrayOf(4, 1, 4, 8, 3, 2, 7, 6, 5)
        val expected = 4
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun myArrayTest4() {
        val numbers = arrayOf(3, 1, 2, 2)
        val expected = 2
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun myArrayTest3() {
        val numbers = arrayOf(4, 3, 1, 1, 4)
        val expected = 4
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }

    @Test
    fun myArrayTest2() {
        val numbers = arrayOf(3, 4, 2, 3, 1, 5)
        val expected = 3
        val actual = findDuplicate(numbers)
        assertEquals(expected, actual)
    }
}
