package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DeleteNodeTest {

    @Test
    fun deleteNode() {
        val d = DeleteNode()
        val nodeToDelete = ListNode(5, ListNode(9, ListNode(1)))
        val node = ListNode(4, nodeToDelete)
        d.deleteNode(nodeToDelete)
        assertEquals(ListNode(4, ListNode(9, ListNode(1))), node)
    }
}
