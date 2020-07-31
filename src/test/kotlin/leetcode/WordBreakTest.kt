package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordBreakTest {

    @Test
    fun wordBreak() {
        val wb = WordBreak()
        assertEquals(true, wb.wordBreak("leetcode", listOf("leet", "code")))
        assertEquals(true, wb.wordBreak("applepenapple", listOf("apple", "pen")))
        assertEquals(false, wb.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }
}
