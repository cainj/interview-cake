package leetcode.lists

class IsPalindromeList {

    fun isPalindrome(head: ListNode?): Boolean {

        val dummy = ListNode(-1)
        var reverse = head
        while (reverse != null) {
            dummy.next = ListNode(reverse.`val`, dummy.next)
            reverse = reverse.next
        }

        var thatNode = dummy.next
        var currNode = head
        while (thatNode != null && currNode != null) {
            if (thatNode.`val` != currNode.`val`) return false
            thatNode = thatNode.next
            currNode = currNode.next
        }

        return true
    }
}
