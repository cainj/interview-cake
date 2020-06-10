package leetcode.facebook

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidPalindromeTest {

    @Test
    fun isPalindrome() {
        val validPalindrome = ValidPalindrome()
        assertEquals(false, validPalindrome.isPalindrome("race a car"))
        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
    }
}
