package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PostfixNotationTest {

    @Test
    fun evalRPN() {
        val postfix = PostfixNotation()
        assertEquals(22, postfix.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))
        assertEquals(9, postfix.evalRPN(arrayOf("2", "1", "+", "3", "*")))
        assertEquals(6, postfix.evalRPN(arrayOf("4", "13", "5", "/", "+")))
    }
}
