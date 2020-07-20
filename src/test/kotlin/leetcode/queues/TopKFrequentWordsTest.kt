package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TopKFrequentWordsTest {

    @Test
    fun topKFrequent() {
        val words = TopKFrequentWords()
        assertEquals(
            listOf("i", "love"),
            words.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2)
        )
        assertEquals(
            listOf("the", "is", "sunny", "day"),
            words.topKFrequent(arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4)
        )
    }
}
