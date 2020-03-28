package ibotta.algos.tries


/**
 *  Trie are used for storing a collection of strings in lexicographic order, ie dictionary, prefix search, etc.
 *
 *  The trie below represents a storing the following words: ace, all, ale, ally, me , pie, peel.
 *
 *
 *                      (root)  <- children { Node('a'), Node('m'), Node('p') } )
 *                    /    |    \
 *                   /     |     \
 *                  /      |      \
 *                 a       m       p
 *                / \      |      / \
 *               c   l     e     e   i
 *              /   / \    |     |    \
 *             e   e   l   *     e     e
 *            /   /   / \        |    / \
 *           *   *   y   *       l   r   *
 *                   |           |   |
 *                   *           *   *
 *
 *  Note: '*' in the tree indicates end of word
 */
class SearchTrie {

    class Node(var value: Char = ' ', var endOfWord: Boolean = false, val children: HashMap<Char, Node> = hashMapOf())

    private val rootNode = Node()

    fun insert(words: Array<String>) = words.forEach { insert(it) }

    fun words(): List<String> = search("")

    private fun insert(word: String) {
        var currentNode = rootNode
        for (c in word) {
            val node = currentNode.children.computeIfAbsent(c) { Node(c) }
            currentNode.children[node.value] = node
            currentNode = node
        }

        currentNode.endOfWord = true
    }


    fun delete(word: String): Boolean {
        val nodes = findWord(word)

        if (nodes.isEmpty())
            return false

        val reversed = nodes.reversed()
        val head = reversed.first()
        head.endOfWord = false

        //remove characters if they have no children
        if (head.children.size == 0) {
            var currentNode = head
            var next: Node?
            var index = 0

            while (!currentNode.endOfWord && index < reversed.size - 1) {
                next = reversed[index + 1]
                next.children.remove(currentNode.value)

                if (next.children.size > 0)
                    break

                index++
                currentNode = next
            }
        }

        return true
    }

    fun containsAll(words: Array<String>) = words.all { exists(it) }

    fun exists(word: String): Boolean {
        var currentNode = rootNode
        for (c in word) {
            if (!currentNode.children.contains(c))
                return false
            currentNode = currentNode.children[c]!!
        }

        return currentNode.endOfWord
    }

    fun search(prefix: String): List<String> {
        var lastNode = rootNode
        val nodes = mutableListOf<Node>()

        for (p in prefix) {
            if (!lastNode.children.contains(p))
                return listOf()

            val next = lastNode.children[p]!!
            lastNode = next
            nodes.add(next)
        }

        return findEndOfWords(lastNode, nodes).fold(emptyList()) { accum, next ->
            accum + convertToStrings(next)
        }
    }

    private fun findWord(word: String): List<Node> {
        var currentNode = rootNode
        val nodes = mutableListOf<Node>()

        for (c in word) {
            if (!currentNode.children.contains(c))
                return emptyList()

            val next = currentNode.children[c]!!
            currentNode = next
            nodes.add(next)
        }

        return nodes
    }

    private fun findEndOfWords(
        node: Node,
        word: List<Node>,
        words: MutableList<List<Node>> = mutableListOf()
    ): List<List<Node>> {
        if (node.endOfWord)
            words.add(word)

        if (node.children.isEmpty())
            return words

        var found = emptyList<List<Node>>()

        for (child in node.children)
            found = findEndOfWords(child.value, word + child.value, words)

        return found
    }

    private fun convertToStrings(nodes: List<Node>): String = String(nodes.map { it.value }.toCharArray())

}
