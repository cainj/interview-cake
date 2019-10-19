package interviewcake

import java.util.*

class WordCloudData(inputString: String) {
    private val wordsToCounts = HashMap<String, Int>()

    private fun populateWordsToCounts(inputString: String) {
        var word = ""
        var middleOfWord = false
        val specialChars = setOf('-', '\'')
        for (c in inputString) {
            if (c.isLetter()
                || (specialChars.contains(c) && middleOfWord)
            ) {
                word += c
                middleOfWord = true
            } else {
                insertIntoMap(word)
                word = ""
                middleOfWord = false
            }
        }
        insertIntoMap(word)
    }

    private fun insertIntoMap(word: String) {
        if (word.isNotEmpty())
            wordsToCounts.compute(word) { _, v ->
                if (v != null)
                    v + 1
                else
                    1
            }
    }

    init {
        populateWordsToCounts(inputString)
    }

    fun getWordsToCounts(): Map<String, Int> {
        return wordsToCounts
    }
}