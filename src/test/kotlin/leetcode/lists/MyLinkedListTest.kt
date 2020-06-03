package leetcode.lists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MyLinkedListTest {

    @Test
    fun linkedListTest() {
        val linked = MyLinkedList()

        linked.addAtHead(1)
        linked.addAtHead(2)
        linked.addAtHead(4)
        assertEquals(4, linked.get(0))
        assertEquals(2, linked.get(1))
        assertEquals(1, linked.get(2))
        linked.addAtTail(5)
        assertEquals(5, linked.get(3))
        linked.deleteAtIndex(1)
        assertEquals(1, linked.get(1))
        assertEquals(5, linked.get(2))
        assertEquals(4, linked.get(0))
        assertEquals(-1, linked.get(3))
        linked.addAtIndex(0, 10)
        assertEquals(10, linked.get(0))
        assertEquals(4, linked.get(1))
    }
}
