package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordSearchIITest {

    @Test
    fun findWords() {
        val wordSearch = WordSearchII()
        assertEquals(
            listOf("oath", "eat"), wordSearch.findWords(
                arrayOf(
                    charArrayOf('o', 'a', 'a', 'n'),
                    charArrayOf('e', 't', 'a', 'e'),
                    charArrayOf('i', 'h', 'k', 'r'),
                    charArrayOf('i', 'f', 'l', 'v')
                )
                , arrayOf("oath", "pea", "eat", "rain")
            )
        )
    }
}
