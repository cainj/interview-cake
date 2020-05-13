package interviewcake

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class ReverseLinkedListTest {

    // tests

    @Test
    fun shortLinkedListTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2))
        val result = reverse(nodes[0])
        assertTrue(isListReversed(result, nodes))
    }

    @Test
    fun longLinkedListTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4, 5, 6))
        val result = reverse(nodes[0])
        assertTrue(isListReversed(result, nodes))
    }

    @Test
    fun oneElementLinkedListTest() {
        val node = LinkedListNode(1)
        val result = reverse(node)
        assertSame(node, result)
    }

    @Test
    fun emptyLinkedListTest() {
        val result = reverse(null)
        assertNull(result)
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

    private fun isListReversed(nodes: LinkedListNode?, originalNodes: Array<LinkedListNode?>): Boolean {
        var list = nodes
        var i = originalNodes.size - 1
        while (list != null && i >= 0) {
            if (originalNodes[i] != list) {
                return false
            }
            list = list.next
            i--
        }
        return list == null && i == -1
    }
}
