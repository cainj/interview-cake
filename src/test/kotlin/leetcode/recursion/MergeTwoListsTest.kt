package leetcode.recursion

import leetcode.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MergeTwoListsTest {

    @Test
    fun mergeTwoLists() {
        val merge = MergeTwoLists()
        val l1 = ListNode(3, ListNode(4, ListNode(5, ListNode(6, ListNode(7)))))
        val l2 = ListNode(1, ListNode(2, ListNode(3)))
        assertEquals(
            ListNode(1, ListNode(2, ListNode(3, ListNode(3, ListNode(4, ListNode(5, ListNode(6, ListNode(7)))))))),
            merge.mergeTwoLists(l1, l2)
        )
    }
}
