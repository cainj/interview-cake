package interviewcake

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

// tests
class ReverseWordsTest {
    @Test
    fun oneWordTest() {
        val expected = "vault".toCharArray()
        val actual = "vault".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoWordsTest() {
        val expected = "cake thief".toCharArray()
        val actual = "thief cake".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun threeWordsTest() {
        val expected = "get another one".toCharArray()
        val actual = "one another get".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun multipleWordsSameLengthTest() {
        val expected = "the cat ate the rat".toCharArray()
        val actual = "rat the ate cat the".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun multipleWordsDifferentLengthsTest() {
        val expected = "chocolate bundt cake is yummy".toCharArray()
        val actual = "yummy is cake bundt chocolate".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun emptyStringTest() {
        val expected = "".toCharArray()
        val actual = "".toCharArray()
        reverseWords(actual)
        assertArrayEquals(expected, actual)
    }
}