package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ArrangeWordsTest {

    @Test
    fun arrangeWords() {
        val aw = ArrangeWords()
        assertEquals("Is cool leetcode", aw.arrangeWords("Leetcode is cool"))
        assertEquals("On and keep calm code", aw.arrangeWords("Keep calm and code on"))
        assertEquals("To be or to be not", aw.arrangeWords("To be or not to be"))
    }
}
