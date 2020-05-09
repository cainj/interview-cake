package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DecodeStringTest {

    @Test
    fun decodeString() {
        val ds = DecodeString()
        assertEquals("accaccacc", ds.decodeString("3[a2[c]]"))
        assertEquals("aaabcbc", ds.decodeString("3[a]2[bc]"))
        assertEquals("abcabccdcdcdef", ds.decodeString("2[abc]3[cd]ef"))
    }
}
