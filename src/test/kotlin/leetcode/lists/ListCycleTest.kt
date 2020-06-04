package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ListCycleTest {

    @Test
    fun hasCycle() {
        val cycle = ListCycle()
        val list = ListNode(1, ListNode(3))
        val c = ListNode(2)
        list.next = c
        c.next = list
        assertEquals(true, cycle.hasCycle(c))
        assertEquals(false, cycle.hasCycle(ListNode(2, ListNode(3, ListNode(9)))))
    }
}
