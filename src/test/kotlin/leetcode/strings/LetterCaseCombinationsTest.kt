package leetcode.strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LetterCaseCombinationsTest {

    @Test
    fun letterCasePermutation() {
        val lcp = LetterCaseCombinations()
        assertEquals(hashSetOf("a1b2", "a1B2", "A1b2", "A1B2"), lcp.letterCasePermutation("a1b2").toSet())
        assertEquals(listOf("12345"), lcp.letterCasePermutation("12345"))
        assertEquals(listOf("3z4", "3Z4"), lcp.letterCasePermutation("3z4"))
    }
}
