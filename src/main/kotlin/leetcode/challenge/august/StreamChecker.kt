package leetcode.challenge.august

import java.util.*

class StreamChecker(words: Array<String>) {

    data class TrieNode(
        val children: HashMap<Char, TrieNode> = hashMapOf(),
        var isEndWord: Boolean = false
    )

    private val root = TrieNode()
    private var queries = LinkedList<Char>()

    init {
        for (word in words) {
            var curr = root
            val reversed = StringBuilder(word).reverse().toString()
            for (c in reversed) {
                val node = curr.children.getOrDefault(c, TrieNode())
                curr.children[c] = node
                curr = node
            }
            curr.isEndWord = true
        }
    }

    fun query(letter: Char): Boolean {
        queries.push(letter)
        var node = root
        for (char in queries) {
            if (node.isEndWord) return true
            if (node.children[char] == null) return false
            node = node.children[char]!!
        }

        return node.isEndWord
    }

}


/**
 * Your StreamChecker object will be instantiated and called as such:
 * var obj = StreamChecker(words)
 * var param_1 = obj.query(letter)
 */
