package leetcode.facebook

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestSubStringTest {

    @Test
    fun lengthOfLongestSubstring() {
        val f = LongestSubString()
        assertEquals(3, f.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, f.lengthOfLongestSubstring("bbbbb"))
        assertEquals(3, f.lengthOfLongestSubstring("pwwkew"))
        assertEquals(0, f.lengthOfLongestSubstring(""))
    }
}
