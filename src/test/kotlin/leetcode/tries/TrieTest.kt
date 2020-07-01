package leetcode.tries

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TrieTest {

    @Test
    fun insert() {
        val trie = Trie()
        trie.insert("hello")
        trie.insert("apple")
        trie.insert("apples")
        assertEquals(false, trie.search("app"))
        assertEquals(true, trie.search("apple"))
        assertEquals(true, trie.startsWith("he"))
        assertEquals(true, trie.search("apples"))
    }
}
