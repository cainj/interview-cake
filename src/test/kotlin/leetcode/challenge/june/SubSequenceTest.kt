package leetcode.challenge.june

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SubSequenceTest {

    @Test
    fun isSubsequence() {
        val sub = SubSequence()
        assertEquals(true, sub.isSubsequence("", ""))
        assertEquals(true, sub.isSubsequence("", "adfasdfdas"))
        assertEquals(true, sub.isSubsequence("ads", "adfas"))
        assertEquals(false, sub.isSubsequence("axs", "adfas"))
        assertEquals(false, sub.isSubsequence("axs", ""))
    }
}
