package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckValidStringTest {

    @Test
    fun checkValidString() {
        val cvs = CheckValidString()
        assertEquals(false, cvs.checkValidString(")"))
        assertEquals(true, cvs.checkValidString(""))
        assertEquals(false, cvs.checkValidString("("))
        assertEquals(false, cvs.checkValidString("())"))
        assertEquals(true, cvs.checkValidString("(*)"))
        assertEquals(true, cvs.checkValidString("()"))
        assertEquals(false, cvs.checkValidString(")*"))
        assertEquals(true, cvs.checkValidString("**))"))
        assertEquals(false, cvs.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"))
        assertEquals(true, cvs.checkValidString("(((******))"))
        assertEquals(false, cvs.checkValidString("("))
    }
}
