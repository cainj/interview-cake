package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinimumRemoveParensTest {

    @Test
    fun minRemoveToMakeValid() {
        val minimumRemoveParens = MinimumRemoveParens()
        assertEquals("lee(t(c)o)de", minimumRemoveParens.minRemoveToMakeValid("lee(t(c)o)de)"))
        assertEquals("", minimumRemoveParens.minRemoveToMakeValid("))(("))
        assertEquals("ab(c)d", minimumRemoveParens.minRemoveToMakeValid("a)b(c)d"))
        assertEquals("a(b(c)d)", minimumRemoveParens.minRemoveToMakeValid("(a(b(c)d)"))
    }
}
