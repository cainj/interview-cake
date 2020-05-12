package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ConnectRightPointersTest {

    @Test
    fun connect() {
        val connect = ConnectRightPointers()
        val tree = Node(1, Node(2), Node(3))
        val node3 = Node(3)
        Assertions.assertEquals(Node(1, Node(2, next = node3), node3), connect.connect(tree))
    }
}
