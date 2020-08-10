package leetcode.tries

class ReplaceWords {

    data class TrieNode(val children: Array<TrieNode?> = Array(26) { null }, var isEndWord: Boolean = false) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as TrieNode

            if (!children.contentEquals(other.children)) return false
            if (isEndWord != other.isEndWord) return false

            return true
        }

        override fun hashCode(): Int {
            var result = children.contentHashCode()
            result = 31 * result + isEndWord.hashCode()
            return result
        }
    }

    private val root = TrieNode()

    fun replaceWords(dict: List<String>, sentence: String): String {
        val words = sentence.split(" ")
        val newSentence = StringBuilder()

        for (word in dict) {
            var currNode = root
            for (c in word) {
                if (currNode.children[c - 'a'] == null)
                    currNode.children[c - 'a'] = TrieNode()
                currNode = currNode.children[c - 'a']!!
            }
            currNode.isEndWord = true
        }

        for (i in words.indices) {
            var currNode = root
            val sb = StringBuilder()

            for (c in words[i]) {
                sb.append(c)
                if (currNode.children[c - 'a'] == null) {
                    sb.clear()
                    break
                } else if (currNode.children[c - 'a']!!.isEndWord) break
                currNode = currNode.children[c - 'a']!!
            }
            if (sb.isNotEmpty()) newSentence.append(sb.append(' ').toString())
            else newSentence.append("${words[i]} ")
        }

        return newSentence.toString().trim()
    }
}
