package leetcode.lists

import leetcode.challenge.july.FlattenDoubleLinkedList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FlattenListTest {

    @Test
    fun flatten() {
        val f = FlattenList()
        val n = Node(1, next = Node(2, child = Node(3, next = Node(4)), next = Node(5)))
        assertEquals(
            Node(1, next = Node(2, next = Node(3, next = Node(4, next = Node(5)))))
            , f.flatten(n)
        )
        val f2 = FlattenDoubleLinkedList()
        assertEquals(
            Node(1, next = Node(2, next = Node(3, next = Node(4, next = Node(5)))))
            , f2.flatten(n)
        )
    }
}
