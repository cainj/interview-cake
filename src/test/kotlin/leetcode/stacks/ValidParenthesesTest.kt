package leetcode.stacks

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidParenthesesTest {

    @Test
    fun isValid() {
        val vp = ValidParentheses()

        assertEquals(true, vp.isValid(""))
        assertEquals(true, vp.isValid("{([])}"))
        assertEquals(true, vp.isValid("(((()))[[[]]]{{{}}})"))
        assertEquals(false, vp.isValid("))))((((("))
        assertEquals(false, vp.isValid("())"))
    }
}
