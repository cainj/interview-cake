package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PrefixWordTest {

    @Test
    fun isPrefixOfWord() {
        val prefix = PrefixWord()
        assertEquals(4, prefix.isPrefixOfWord("i use triple pillow", "pill"))
        assertEquals(2, prefix.isPrefixOfWord("this problem is an easy problem", "pro"))
        assertEquals(-1, prefix.isPrefixOfWord("hello from the other side", "they"))
    }
}
