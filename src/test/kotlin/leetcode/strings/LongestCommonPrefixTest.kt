package leetcode.strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix() {
        val lcp = LongestCommonPrefix()
        assertEquals("fl", lcp.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", lcp.longestCommonPrefix(arrayOf("dog", "car", "racecar")))
        assertEquals("d", lcp.longestCommonPrefix(arrayOf("d")))

    }
}
