package leetcode.recursion

import leetcode.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ReverseLinkedListTest {

    @Test
    fun reverseList() {
        val reverse = ReverseLinkedList()
        Assertions.assertEquals(
            ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1))))),
            reverse.reverseList(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))
        )
    }
}
