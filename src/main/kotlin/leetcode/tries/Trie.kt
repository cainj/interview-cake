package leetcode.tries

class Trie {

    data class Node(val value: Char, val children: HashMap<Char, Node> = hashMapOf()) {
        var isEnd: Boolean = false
    }

    private val root = Node(' ')

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var currentNode = root
        for (c in word) {
            val node = currentNode.children.computeIfAbsent(c) { Node(c) }
            currentNode.children[node.value] = node
            currentNode = node
        }

        currentNode.isEnd = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        var currentNode = root
        for (c in word)
            if (currentNode.children.contains(c)) currentNode = currentNode.children[c]!!
            else return false

        return currentNode.isEnd
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        var currentNode = root
        for (c in prefix)
            if (currentNode.children.contains(c)) currentNode = currentNode.children[c]!!
            else return false

        return true
    }
}
