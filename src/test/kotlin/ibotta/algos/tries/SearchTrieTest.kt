package ibotta.algos.tries

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SearchTrieTest {

    @Test
    fun exists() {
        val trie = SearchTrie()
        val words = arrayOf("pie", "pepper", "all", "ally", "me")
        trie.insert(words)
        Assertions.assertEquals(trie.exists("pie"), true)
        Assertions.assertEquals(trie.exists("pepper"), true)
        Assertions.assertEquals(trie.exists("all"), true)
        Assertions.assertEquals(trie.exists("ally"), true)
        Assertions.assertEquals(trie.exists("mean"), false)
    }

    @Test
    fun containsAll() {
        val trie = SearchTrie()
        val words = arrayOf("pie", "pepper", "ally", "me")
        trie.insert(words)
        Assertions.assertEquals(trie.containsAll(words), true)
        Assertions.assertEquals(trie.containsAll(arrayOf("all")), false)
        Assertions.assertEquals(trie.containsAll(arrayOf("pepper")), true)
        Assertions.assertEquals(trie.containsAll(arrayOf("salt")), false)
    }

    @Test
    fun search() {
        val trie = SearchTrie()
        val words = arrayOf("pie", "pepper", "ally", "all", "me")
        trie.insert(words)
        Assertions.assertEquals(trie.search("p").containsAll(listOf("pepper", "pie")), true)
        Assertions.assertEquals(trie.search("pi").containsAll(listOf("pie")), true)
        Assertions.assertEquals(trie.search("a").containsAll(listOf("all", "ally")), true)
        Assertions.assertEquals(trie.search("b").isEmpty(), true)
    }

    @Test
    fun words() {
        val trie = SearchTrie()
        val words = arrayOf("peter", "piper", "picked", "a", "pepper")
        trie.insert(words)
        Assertions.assertEquals(trie.words().containsAll(words.toList()), true)
        println(trie.words())
    }

    @Test
    fun delete() {
        val trie = SearchTrie()
        val words = arrayOf("pie", "pepper", "all", "ally", "me", "pier")
        trie.insert(words)
        Assertions.assertEquals(trie.delete("pier"), true)
        Assertions.assertEquals(trie.exists("pier"), false)
        Assertions.assertEquals(trie.exists("pie"), true)
        Assertions.assertEquals(trie.delete("pie"), true)
        Assertions.assertEquals(trie.exists("pie"), false)
        Assertions.assertEquals(trie.delete("all"), true)
        Assertions.assertEquals(trie.exists("all"), false)
        Assertions.assertEquals(trie.exists("ally"), true)
        Assertions.assertEquals(trie.delete("me"), true)
        Assertions.assertEquals(trie.exists("me"), false)
    }
}