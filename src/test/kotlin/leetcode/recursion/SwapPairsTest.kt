package leetcode.recursion

import leetcode.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SwapPairsTest {

    @Test
    fun swapPairs() {
        val sp = SwapPairs()
        assertEquals(
            ListNode(2, ListNode(1, ListNode(4, ListNode(3)))),
            sp.swapPairs(ListNode(1, ListNode(2, ListNode(3, ListNode(4)))))
        )
        assertEquals(
            ListNode(2, ListNode(1, ListNode(4, ListNode(3, ListNode(5))))),
            sp.swapPairs(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))
        )
    }
}
