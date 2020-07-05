package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveElementsTest {

    @Test
    fun removeElements() {
        val re = RemoveElements()
        val node: ListNode? = ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1)))))

        assertEquals(
            ListNode(4, ListNode(3, ListNode(2, ListNode(1)))),
            re.removeElements(node, 5)
        )
        assertEquals(
            null,
            re.removeElements(null, 1)
        )
        assertEquals(
            ListNode(1),
            re.removeElements(ListNode(5, ListNode(5, ListNode(5, ListNode(1)))), 5)
        )
        assertEquals(
            null,
            re.removeElements(ListNode(5, ListNode(5, ListNode(5, ListNode(5)))), 5)
        )
        assertEquals(
            ListNode(5, ListNode(4, ListNode(3, ListNode(2)))),
            re.removeElements(node, 1)
        )
    }
}
