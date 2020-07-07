package leetcode.lists

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class OddEvenListTest {

    @Test
    fun oddEvenList() {
        val oddEven = OddEvenList()
        Assertions.assertEquals(
            ListNode(1, ListNode(3, ListNode(2, ListNode(4)))),
            oddEven.oddEvenList(ListNode(1, ListNode(2, ListNode(3, ListNode(4)))))
        )
        Assertions.assertEquals(
            ListNode(1, ListNode(3, ListNode(5, ListNode(2, ListNode(4))))),
            oddEven.oddEvenList(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))
        )
        Assertions.assertEquals(
            null,
            oddEven.oddEvenList(null)
        )
    }
}
