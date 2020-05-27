package leetcode.arrays

import leetcode.arrays.ReverseWords
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReverseWordsTest {

    @Test
    fun reverseWords() {
        val rw = ReverseWords()
        assertEquals("blue is sky the", rw.reverseWords("the sky is blue"))
        assertEquals("world! hello", rw.reverseWords("  hello world!  "))
        assertEquals("", rw.reverseWords(""))
        assertEquals("example good a", rw.reverseWords("a good   example"))
    }
}
