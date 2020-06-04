package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ListCycleIITest {

    @Test
    fun detectCycle() {
        val dc = ListCycleII()
        val list = ListNode(1, ListNode(3))
        val c = ListNode(2)
        list.next = c
        c.next = list
        assertEquals(1, dc.detectCycle(list)?.`val`)
        assertEquals(null, dc.detectCycle(ListNode(2, ListNode(3, ListNode(9)))))
    }
}
