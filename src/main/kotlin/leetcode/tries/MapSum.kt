package leetcode.tries

class MapSum() {

    /** Initialize your data structure here. */
    data class TrieNode(val children: HashMap<Char, TrieNode> = hashMapOf(), var score: Int = 0)

    private val root = TrieNode()
    private val map= hashMapOf<String, Int>()

    fun insert(key: String, `val`: Int) {
        val delta = `val` - map.getOrDefault(key, 0)

        map[key] = `val`
        var currNode = root
        currNode.score += delta
        for (c in key) {
            val node = currNode.children.getOrDefault(c, TrieNode())
            node.score += delta
            currNode.children[c] = node
            currNode = node
        }
    }

    fun sum(prefix: String): Int {
        var currNode = root

        for (c in prefix) {
            if (!currNode.children.contains(c)) return 0
            val node = currNode.children[c]!!
            currNode = node
        }

        return currNode.score
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * var obj = MapSum()
 * obj.insert(key,`val`)
 * var param_2 = obj.sum(prefix)
 */
