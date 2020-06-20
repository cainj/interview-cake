package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestDuplicateTest {

    @Test
    fun longestDupSubstring() {
        val longDup = LongestDuplicate()
        assertEquals("", longDup.longestDupSubstring("abcd"))
        assertEquals("ana", longDup.longestDupSubstring("banana"))
        assertEquals("e", longDup.longestDupSubstring("leetcode"))
    }
}
