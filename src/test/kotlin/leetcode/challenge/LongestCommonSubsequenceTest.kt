package leetcode.challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestCommonSubsequenceTest {

    @Test
    fun longestCommonSubsequence() {
        val lcs = LongestCommonSubsequence()
        assertEquals(3, lcs.longestCommonSubsequence("ace", "adce"))
        assertEquals(4, lcs.longestCommonSubsequence("aggtb", "adcgtetaab"))
    }
}