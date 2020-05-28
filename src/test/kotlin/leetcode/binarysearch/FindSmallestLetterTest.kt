package leetcode.binarysearch

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindSmallestLetterTest {

    @Test
    fun nextGreatestLetter() {
        val ngl = FindSmallestLetter()
        assertEquals('b', ngl.nextGreatestLetter(charArrayOf('a', 'b', 'c'), 'a'))
        assertEquals('c', ngl.nextGreatestLetter(charArrayOf('a', 'b', 'c'), 'b'))
        assertEquals('a', ngl.nextGreatestLetter(charArrayOf('a', 'b', 'c'), 'c'))
    }
}
