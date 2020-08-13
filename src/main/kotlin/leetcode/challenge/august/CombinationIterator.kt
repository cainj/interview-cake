package leetcode.challenge.august

import java.util.*

class CombinationIterator(characters: String, combinationLength: Int) {
    private val combinations = LinkedList<String>()
    private val sb = StringBuilder(combinationLength)

    init {
        backtracking(characters, 0, combinationLength, sb)
    }

    fun next(): String = combinations.pop()

    fun hasNext(): Boolean = combinations.isNotEmpty()


    private fun backtracking(chars: String, index: Int, k: Int, sb: StringBuilder) {
        if (sb.length == k) combinations.add(sb.toString())

        for (i in index until chars.length) {
            sb.append(chars[i])
            backtracking(chars, i + 1, k, sb)
            sb.deleteCharAt(sb.length - 1)
        }
    }
}
