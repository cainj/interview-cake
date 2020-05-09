package leetcode.strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidPalindrome2Test {

    @Test
    fun validPalindrome() {
        val palindrome = ValidPalindrome2()
        assertEquals(true, palindrome.validPalindrome("abac"))
        assertEquals(true, palindrome.validPalindrome("aba"))
        assertEquals(false, palindrome.validPalindrome("abc"))
    }
}
