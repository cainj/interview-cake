package leetcode.lists

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoLinkedListsTest {

    @Test
    fun getIntersectionNode() {
        val dc = TwoLinkedLists()
        val intersection = ListNode(1, ListNode(3))
        val listA = ListNode(4, ListNode(5, intersection))
        val listB = ListNode(2, intersection)
        assertEquals(intersection, dc.getIntersectionNode(listA, listB))
    }
}
