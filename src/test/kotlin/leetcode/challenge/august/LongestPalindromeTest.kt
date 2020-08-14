package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestPalindromeTest {

    @Test
    fun longestPalindrome() {
        val lp = LongestPalindrome()
        assertEquals(7, lp.longestPalindrome("abccccdd"))
        assertEquals(0, lp.longestPalindrome(""))
        assertEquals(1, lp.longestPalindrome("a"))
    }
}
