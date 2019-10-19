package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test


class KthToLastNodeTest {

    // tests

    @Test
    fun firstToLastNodeTest() {
        val listNodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val k = 1
        val actual = kthToLastNode(k, listNodes[0])
        val expected = listNodes[listNodes.size - k]
        assertSame(expected, actual)
    }

    @Test
    fun secondToLastNodeTest() {
        val listNodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val k = 2
        val actual = kthToLastNode(k, listNodes[0])
        val expected = listNodes[listNodes.size - k]
        assertSame(expected, actual)
    }

    @Test
    fun firstNodeTest() {
        val listNodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val k = 4
        val actual = kthToLastNode(k, listNodes[0])
        val expected = listNodes[listNodes.size - k]
        assertSame(expected, actual)
    }

    @Test
    fun kIsGreaterThanLinkedListLengthTest() {
        val listNodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val k = 5
        Assertions.assertThrows(Exception::class.java) { kthToLastNode(k, listNodes[0]) }
    }

    @Test
    fun kIsZeroTest() {
        val listNodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val k = 0
        Assertions.assertThrows(Exception::class.java) { kthToLastNode(k, listNodes[0]) }
    }

    private fun valuesToLinkedListNodes(values: IntArray): Array<LinkedListNode?> {
        val nodes = arrayOfNulls<LinkedListNode>(values.size)
        for (i in values.indices) {
            nodes[i] = LinkedListNode(values[i])
            if (i > 0) {
                nodes[i - 1]?.next = nodes[i]
            }
        }
        return nodes
    }
}