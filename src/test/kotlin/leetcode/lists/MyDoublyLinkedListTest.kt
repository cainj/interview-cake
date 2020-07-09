package leetcode.lists

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyDoublyLinkedListTest{
    @Test
    fun test(){
        val doublyLinkedList = MyDoublyLinkedList()
        doublyLinkedList.addAtHead(1)
        assertEquals(1, doublyLinkedList.get(0))
        doublyLinkedList.addAtIndex(1, 2)
        assertEquals(2, doublyLinkedList.get(1))
        assertEquals(-1, doublyLinkedList.get(2))
        doublyLinkedList.deleteAtIndex(0)
        assertEquals(2, doublyLinkedList.get(0))
        doublyLinkedList.addAtTail(9)
        assertEquals(9, doublyLinkedList.get(1))
    }
}
