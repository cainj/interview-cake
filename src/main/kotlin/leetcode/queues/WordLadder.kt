package leetcode.queues

import java.util.*

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of
 * shortest transformation sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list.
 *
 * Note:
 *  • Return 0 if there is no such transformation sequence.
 *  • All words have the same length.
 *  • All words contain only lowercase alphabetic characters.
 *  • You may assume no duplicates in the word list.
 *  • You may assume beginWord and endWord are non-empty and are not the same.
 *
 * Example 1:
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * Output: 5
 * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", return its length 5.
 *
 * Example 2:
 * Input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 */
class WordLadder {

    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val deque = LinkedList<String?>()
        val visited = hashSetOf<String>()

        deque.offer(beginWord)
        deque.offer(null)

        var count = 1
        while (deque.isNotEmpty()) {
            val word = deque.poll()

            if (word == null) {
                count++
                if (deque.peek() != null) deque.offer(null)
            } else if (word == endWord) return count
            else
                for (c in validCandidates(word, wordList))
                    if (!visited.contains(c)) {
                        visited.add(c)
                        deque.offer(c)
                    }
        }

        return 0
    }

    private fun validCandidates(beginWord: String, wordList: List<String>): List<String> {
        val candidates = mutableListOf<String>()
        for (word in wordList) {
            var count = 0
            for (i in word.indices) {
                if (word[i] != beginWord[i]) count++
                if (count > 1) break
            }
            if (count <= 1) candidates.add(word)
        }

        return candidates
    }
}
