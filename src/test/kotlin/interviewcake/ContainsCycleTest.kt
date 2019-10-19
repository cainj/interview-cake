package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class ContainsCycleTest {

    @Test
    fun linkedListWithNoCycleTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        val result = containsCycle(nodes[0])
        assertFalse(result)
    }

    @Test
    fun cycleLoopsToBeginningTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4))
        nodes[3]?.next = nodes[0]
        val result = containsCycle(nodes[0])
        assertTrue(result)
    }

    @Test
    fun cycleLoopsToMiddleTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4, 5))
        nodes[4]?.next = nodes[2]
        val result = containsCycle(nodes[0])
        assertTrue(result)
    }

    @Test
    fun twoNodeCycleAtEndTest() {
        val nodes = valuesToLinkedListNodes(intArrayOf(1, 2, 3, 4, 5))
        nodes[4]?.next = nodes[3]
        val result = containsCycle(nodes[0])
        assertTrue(result)
    }

    @Test
    fun emptyListTest() {
        val result = containsCycle(null)
        assertFalse(result)
    }

    @Test
    fun oneElementLinkedListNoCycleTest() {
        val node = LinkedListNode(1)
        val result = containsCycle(node)
        assertFalse(result)
    }

    @Test
    fun oneElementLinkedListCycleTest() {
        val node = LinkedListNode(1)
        node.next = node
        val result = containsCycle(node)
        assertTrue(result)
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