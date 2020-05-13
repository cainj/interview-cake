package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConnectRightPointersIITest {

    @Test
    fun connect() {
        val connectII = ConnectRightPointersII()
        var tree = Node(1, Node(2), Node(3))
        var node3 = Node(3)
        assertEquals(Node(1, Node(2, next = node3), node3), connectII.connect(tree))
        val node5 = Node(5)
        node3 = node3.copy(right = node5)
        tree = Node(1, Node(2, Node(4)), Node(3, right = Node(5)))
        assertEquals(Node(1, Node(2, Node(4, next = node5), next = node3), node3), connectII.connect(tree))
    }
}
