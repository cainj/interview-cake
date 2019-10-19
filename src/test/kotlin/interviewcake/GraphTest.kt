package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import java.util.*
import kotlin.math.max


class GraphTest {

    @Test
    fun lineGraphTest() {
        val nodeA = GraphNode("A")
        val nodeB = GraphNode("B")
        val nodeC = GraphNode("C")
        val nodeD = GraphNode("D")
        nodeA.addNeighbor(nodeB)
        nodeB.addNeighbor(nodeA)
        nodeB.addNeighbor(nodeC)
        nodeC.addNeighbor(nodeB)
        nodeC.addNeighbor(nodeD)
        nodeD.addNeighbor(nodeC)
        val graph = arrayOf(nodeA, nodeB, nodeC, nodeD)
        colorGraph(graph, getColors())
        validateGraphColoring(graph)
    }

    @Test
    fun separateGraphTest() {
        val nodeA = GraphNode("A")
        val nodeB = GraphNode("B")
        val nodeC = GraphNode("C")
        val nodeD = GraphNode("D")
        nodeA.addNeighbor(nodeB)
        nodeB.addNeighbor(nodeA)
        nodeC.addNeighbor(nodeD)
        nodeD.addNeighbor(nodeC)
        val graph = arrayOf(nodeA, nodeB, nodeC, nodeD)
        colorGraph(graph, getColors())
        validateGraphColoring(graph)
    }

    @Test
    fun triangleGraphTest() {
        val nodeA = GraphNode("A")
        val nodeB = GraphNode("B")
        val nodeC = GraphNode("C")
        nodeA.addNeighbor(nodeB)
        nodeA.addNeighbor(nodeC)
        nodeB.addNeighbor(nodeA)
        nodeB.addNeighbor(nodeC)
        nodeC.addNeighbor(nodeA)
        nodeC.addNeighbor(nodeB)
        val graph = arrayOf(nodeA, nodeB, nodeC)
        colorGraph(graph, getColors())
        validateGraphColoring(graph)
    }

    @Test
    fun envelopeGraphTest() {
        val nodeA = GraphNode("A")
        val nodeB = GraphNode("B")
        val nodeC = GraphNode("C")
        val nodeD = GraphNode("D")
        val nodeE = GraphNode("E")
        nodeA.addNeighbor(nodeB)
        nodeA.addNeighbor(nodeC)
        nodeB.addNeighbor(nodeA)
        nodeB.addNeighbor(nodeC)
        nodeB.addNeighbor(nodeD)
        nodeB.addNeighbor(nodeE)
        nodeC.addNeighbor(nodeA)
        nodeC.addNeighbor(nodeB)
        nodeC.addNeighbor(nodeD)
        nodeC.addNeighbor(nodeE)
        nodeD.addNeighbor(nodeB)
        nodeD.addNeighbor(nodeC)
        nodeD.addNeighbor(nodeE)
        nodeE.addNeighbor(nodeB)
        nodeE.addNeighbor(nodeC)
        nodeE.addNeighbor(nodeD)
        val graph = arrayOf(nodeA, nodeB, nodeC, nodeD, nodeE)
        colorGraph(graph, getColors())
        validateGraphColoring(graph)
    }

    @Test
    fun loopGraphTest() {
        val nodeA = GraphNode("A")
        nodeA.addNeighbor(nodeA)
        val graph = arrayOf(nodeA)
        Assertions.assertThrows(Exception::class.java) { colorGraph(graph, getColors()) }
    }

    private fun getColors(): Array<String> {
        return arrayOf("red", "green", "blue", "orange", "yellow", "white")
    }

    private fun validateGraphColoring(graph: Array<GraphNode>) {

        for (node in graph) {
            if (!node.hasColor()) {
                fail(String.format("Found non-colored node %s", node.label))
            }
        }

        var maxDegree = 0
        val usedColors = HashSet<String>()

        for (node in graph) {
            val neighbors = node.getNeighbors()
            maxDegree = max(maxDegree, neighbors.size)
            usedColors.add(node.getColor()!!)
        }

        val allowedColorCount = maxDegree + 1

        if (usedColors.size > allowedColorCount) {
            fail(
                String.format(
                    "Too many colors: %d allowed, but %d actually used",
                    allowedColorCount, usedColors.size
                )
            )
        }

        for (node in graph) {
            val neighbors = node.getNeighbors()
            for (neighbor in neighbors) {
                if (neighbor.getColor() == node.getColor()) {
                    fail(
                        String.format(
                            "Neighbor nodes %s and %s have the same color %s",
                            node.label, neighbor.label, node.getColor()
                        )
                    )
                }
            }
        }
    }
}