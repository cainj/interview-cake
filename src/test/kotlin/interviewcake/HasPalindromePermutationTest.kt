package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test



class HasPalindromePermutationTest {

    @Test
    fun permutationWithOddNumberOfCharsTest() {
        val result = hasPalindromePermutation("aabcbcd")
        assertTrue(result)
    }

    @Test
    fun permutationWithEvenNumberOfCharsTest() {
        val result = hasPalindromePermutation("aabccbdd")
        assertTrue(result)
    }

    @Test
    fun noPermutationWithOddNumberOfChars() {
        val result = hasPalindromePermutation("aabcd")
        assertFalse(result)
    }

    @Test
    fun noPermutationWithEvenNumberOfCharsTest() {
        val result = hasPalindromePermutation("aabbcd")
        assertFalse(result)
    }

    @Test
    fun emptyStringTest() {
        val result = hasPalindromePermutation("")
        assertTrue(result)
    }

    @Test
    fun oneCharacterStringTest() {
        val result = hasPalindromePermutation("a")
        assertTrue(result)
    }
}