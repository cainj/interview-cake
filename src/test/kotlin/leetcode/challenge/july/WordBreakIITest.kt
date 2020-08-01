package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordBreakIITest {

    @Test
    fun wordBreak() {
        val wb = WordBreakII()
        assertEquals(
            emptyList<String>(),
            wb.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat"))
        )
        assertEquals(
            listOf(
                "pineapple pen apple",
                "pine apple pen apple",
                "pine applepen apple"
            ),
            wb.wordBreak(
                "pineapplepenapple",
                listOf("apple", "pen", "applepen", "pine", "pineapple")
            )
        )
    }
}
