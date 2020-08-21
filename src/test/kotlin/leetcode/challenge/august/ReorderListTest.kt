package leetcode.challenge.august

import leetcode.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReorderListTest {

    @Test
    fun reorderList() {
        val reorderList = ReorderList()
        val l = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        reorderList.reorderList(l)
        assertEquals(ListNode(1, ListNode(5, ListNode(2, ListNode(4, ListNode(3))))), l)
    }
}
