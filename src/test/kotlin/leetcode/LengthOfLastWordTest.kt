package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LengthOfLastWordTest {

    @Test
    fun lengthOfLastWord() {
        val llw = LengthOfLastWord()
        assertEquals( 5, llw.lengthOfLastWord("Hello World"))
        assertEquals( 3, llw.lengthOfLastWord("Have my cake and eat it too    "))
    }
}
