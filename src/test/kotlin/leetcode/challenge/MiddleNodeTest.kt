package leetcode.challenge

import leetcode.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MiddleNodeTest {

    private val sn = MiddleNode()

    @Test
    fun middleNode() {
        val node = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        Assertions.assertEquals(sn.middleNode(node), ListNode(3, ListNode(4, ListNode(5))))

        val node2 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
        Assertions.assertEquals(sn.middleNode(node2), ListNode(4, ListNode(5, ListNode(6))))
    }

}