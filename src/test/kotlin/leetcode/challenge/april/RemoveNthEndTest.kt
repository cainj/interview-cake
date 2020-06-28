package leetcode.challenge.april

import leetcode.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveNthEndTest {

    @Test
    fun removeNthFromEnd() {
        var list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val remove = RemoveNthEnd()
        assertEquals(ListNode(1, ListNode(2, ListNode(3, ListNode(4)))), remove.removeNthFromEnd(list, 1))
        list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        assertEquals(ListNode(1, ListNode(2, ListNode(3, ListNode(5)))), remove.removeNthFromEnd(list, 2))
        list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        assertEquals(ListNode(1, ListNode(2, ListNode(4, ListNode(5)))), remove.removeNthFromEnd(list, 3))
        list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        assertEquals(ListNode(1, ListNode(3, ListNode(4, ListNode(5)))), remove.removeNthFromEnd(list, 4))
        list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        assertEquals(ListNode(2, ListNode(3, ListNode(4, ListNode(5)))), remove.removeNthFromEnd(list, 5))
    }
}
