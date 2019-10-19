package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ClosingParenTest {

    @Test
    fun simpleClosersTest() {
        val expected = 6
        val actual = getClosingParen("((abc))", 0)
        assertEquals(expected, actual)
    }

    @Test
    fun simpleClosersTest2() {
        Assertions.assertThrows(Exception::class.java) { getClosingParen("))abc))", 0) }
    }

    @Test
    fun complicatedTest() {
        val expected = 76
        val actual =
            getClosingParen(
                "Sometimes (when I nest them (my parenthesis) too much (like this (and this))) they get confusing.",
                10
            )
        assertEquals(expected, actual)
    }

    @Test
    fun allOpenersThenClosersTest() {
        val expected = 7
        val actual = getClosingParen("((((()))))", 2)
        assertEquals(expected, actual)
    }

    @Test
    fun mixedOpenersAndClosersTest() {
        val expected = 10
        val actual = getClosingParen("()()((()()))", 5)
        assertEquals(expected, actual)
    }

    @Test
    fun noMatchingCloserTest() {
        Assertions.assertThrows(Exception::class.java) { getClosingParen("()(()", 2) }
    }
}