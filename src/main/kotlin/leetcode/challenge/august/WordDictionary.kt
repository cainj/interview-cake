package leetcode.challenge.august

class WordDictionary {

    private val children = Array<WordDictionary?>(26) { null }
    private var isEnd = false

    /** Inserts a word into the trie. */
    fun addWord(word: String) {
        var currNode = this

        for (c in word) {
            if (currNode.children[c - 'a'] == null)
                currNode.children[c - 'a'] = WordDictionary()
            currNode = currNode.children[c - 'a']!!
        }
        currNode.isEnd = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        var currNode = this
        for (i in word.indices) {
            val c = word[i]
            if ('.' == c) {
                for (child in currNode.children)
                    if (child != null && child.search(word.substring(i + 1))) return true

                return false
            }
            if (currNode.children[c - 'a'] == null) return false
            currNode = currNode.children[c - 'a']!!
        }

        return currNode.isEnd
    }


}
