package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordDictionaryTest {

    @Test
    fun search() {
        val wordDictionary = WordDictionary()
        wordDictionary.addWord("bad")
        wordDictionary.addWord("dad")
        wordDictionary.addWord("mad")

        assertEquals(true, wordDictionary.search("b.d"))
        assertEquals(true, wordDictionary.search("b.."))
        assertEquals(false, wordDictionary.search("...."))
        assertEquals(false, wordDictionary.search("pad"))
    }
}
