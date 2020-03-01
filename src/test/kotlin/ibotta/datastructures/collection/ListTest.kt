package ibotta.datastructures.collection

import ibotta.datastructures.collections.List
import ibotta.datastructures.collections.Node
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException

class ListTest {

    @Test
    fun basicOperations() {
        val list = List(1, 2, 3, 4)
        Assertions.assertEquals(list.first(), 1)
        Assertions.assertEquals(list.size, 4)
        list.prepend(0)
        Assertions.assertEquals(list.size, 5)
        Assertions.assertEquals(list.first(), 0)
        Assertions.assertEquals(list.last(), 4)
        list.append(5)
        Assertions.assertEquals(list.size, 6)
        Assertions.assertEquals(list.first(), 0)
        Assertions.assertEquals(list.last(), 5)

        list.removeAt(5)
        Assertions.assertEquals(list.contains(5), false)
        Assertions.assertEquals(list.last(), 4)
        Assertions.assertEquals(list.first(), 0)
        list.removeAt(2)
        Assertions.assertEquals(list.size, 4)
        Assertions.assertEquals(list.contains(2), false)
        Assertions.assertEquals(list.contains(0), true)
        Assertions.assertEquals(list.contains(4), true)
        list.insertAt(2, 2)
        Assertions.assertEquals(list.contains(2), true)
    }

    @Test
    fun kthLastTest() {
        val list = List(0, 1, 2, 3, 4, 5, 6)
        Assertions.assertEquals(list.last(), 6)
        Assertions.assertEquals(list.kthFromLast(2), 4)
        Assertions.assertEquals(list.kthFromLast(5), 1)
        Assertions.assertEquals(list.kthFromLast(6), 0)
        Assertions.assertThrows(IndexOutOfBoundsException::class.java){list.kthFromLast(7)}
    }

    @Test
    fun hasCycleTest() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        node1.next = node2
        node2.next = node3
        node3.next = node1
        Assertions.assertEquals(List.hasCycle(node1), true)
    }
}
