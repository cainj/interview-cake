package leetcode.stacks

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CloneGraphTest {

    @Test
    fun cloneGraph() {
        val cloneGraph = CloneGraph()
        val node4 = Node(4)
        val node2 = Node(2)
        val node = Node(1, arrayListOf(node2, node4))
        val node3 = Node(3, arrayListOf(node4, node2))
        node2.neighbors.add(node)
        node2.neighbors.add(node3)
        node4.neighbors.add(node)
        node4.neighbors.add(node3)
        assertNotEquals(node, cloneGraph.cloneGraph(node))
        assertEquals(null, cloneGraph.cloneGraph(null))
        val oneNode = Node(1)
        assertNotEquals(oneNode, cloneGraph.cloneGraph(oneNode))
    }
}
