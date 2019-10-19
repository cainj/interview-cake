package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class JavascriptValidatorTest {

    @Test
    fun validShortCodeTest() {
        val result = isValid("()")
        assertTrue(result)
    }

    @Test
    fun validWithCodeTest() {
        val result = isValid("if(x == 0)")
        assertTrue(result)
    }

    @Test
    fun validRubyTest() {
        val result = isValid("{|like this|}")
        assertTrue(result)
    }

    @Test
    fun validLongerCodeTest() {
        val result = isValid("([]{[]})[]{{}()}")
        assertTrue(result)
    }

    @Test
    fun mismatchedOpenerAndCloserTest() {
        val result = isValid("([][]}")
        assertFalse(result)
    }

    @Test
    fun interleavedOpenersAndClosersTest() {
        val result = isValid("([)]")
        assertFalse(result)
    }

    @Test
    fun missingCloserTest() {
        val result = isValid("[[]()")
        assertFalse(result)
    }

    @Test
    fun extraCloserTest() {
        val result = isValid("[[]]())")
        assertFalse(result)
    }

    @Test
    fun emptyStringTest() {
        val result = isValid("")
        assertTrue(result)
    }
}