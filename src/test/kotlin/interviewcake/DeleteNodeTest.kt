package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test


class DeleteNodeTest {

    @Test
    fun nodeAtBeginningTest() {
        val head = LinkedListNode(1)
        appendToList(head, 2)
        appendToList(head, 3)
        appendToList(head, 4)

        deleteNode(head)

        var node: LinkedListNode? = head
        assertEquals(2, node!!.value)

        node = node.next
        assertEquals(3, node!!.value)

        node = node.next
        assertEquals(4, node!!.value)

        assertNull(node.next)
    }

    @Test
    fun nodeInTheMiddleTest() {
        val head = LinkedListNode(1)
        val nodeToDelete = appendToList(head, 2)
        appendToList(head, 3)
        appendToList(head, 4)

        deleteNode(nodeToDelete)

        var node: LinkedListNode? = head
        assertEquals(1, node!!.value)

        node = node.next
        assertEquals(3, node!!.value)

        node = node.next
        assertEquals(4, node!!.value)

        assertNull(node.next)
    }

    @Test
    fun nodeAtTheEndTest() {
        val head = LinkedListNode(1)
        appendToList(head, 2)
        appendToList(head, 3)
        val nodeToDelete = appendToList(head, 4)

        Assertions.assertThrows(Exception::class.java) {
            deleteNode(nodeToDelete)
        }
    }

    @Test
    fun oneNodeListTest() {
        val head = LinkedListNode(1)
        Assertions.assertThrows(Exception::class.java) {
            deleteNode(head)
        }
    }

    private fun appendToList(head: LinkedListNode, value: Int): LinkedListNode? {
        var current: LinkedListNode? = head
        while (current!!.next != null) {
            current = current.next
        }
        current.next = LinkedListNode(value)
        return current.next
    }
}