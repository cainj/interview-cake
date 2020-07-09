package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IsPalindromeListTest {

    @Test
    fun isPalindrome() {
        val palindromeList = IsPalindromeList()
        assertEquals(false, palindromeList.isPalindrome(ListNode(1, ListNode(2))))
        assertEquals(true, palindromeList.isPalindrome(ListNode(1, ListNode(2, ListNode(2, ListNode(1))))))
        assertEquals(true, palindromeList.isPalindrome(ListNode(1, ListNode(2, ListNode(3, ListNode(2, ListNode(1)))))))
        assertEquals(
            false,
            palindromeList.isPalindrome(ListNode(1, ListNode(2, ListNode(3, ListNode(2, ListNode(2))))))
        )
        assertEquals(true, palindromeList.isPalindrome(ListNode(1)))
        assertEquals(true, palindromeList.isPalindrome(null))
    }
}
