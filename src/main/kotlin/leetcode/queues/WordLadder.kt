package leetcode.queues

import java.util.*

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
