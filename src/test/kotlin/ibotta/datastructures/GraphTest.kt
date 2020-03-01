package ibotta.datastructures

import ibotta.datastructures.graph.Graph
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GraphTest {

    @Test
    fun unweightedGraphShortestPathTest() {
        val straightLine = Graph()
        (1..10).forEach { straightLine.addVertex(it.toString()) }
        straightLine.addEdge("1", "2")
        straightLine.addEdge("2", "3")
        straightLine.addEdge("3", "4")
        straightLine.addEdge("4", "5")
        straightLine.addEdge("5", "6")
        straightLine.addEdge("6", "7")
        straightLine.addEdge("7", "8")
        straightLine.addEdge("8", "9")
        straightLine.addEdge("9", "10")
        var path = straightLine.shortestPath("1", "10")
        check(path.size == 10) { "size of path is ${path.size}" }
        val edge = straightLine.getEdge("1", "2")
        check(edge.from == "1")
        check(edge.to == "2")
        check(edge.weight == 0)


        val star = Graph()
        (1..7).forEach { star.addVertex(it.toString()) }
        star.addEdge("1", "2")
        star.addEdge("1", "3")
        star.addEdge("1", "4")
        star.addEdge("1", "5")
        star.addEdge("1", "6")
        star.addEdge("1", "7")
        path = star.shortestPath("1", "5")
        Assertions.assertEquals(path.size, 2)

        val vertexOne = star.getVertex("1")
        Assertions.assertEquals(vertexOne.edges.size, 6)
        Assertions.assertThrows(IllegalStateException::class.java) { star.getVertex("i") }
        val vertexSeven = star.getVertex("7")
        Assertions.assertEquals(vertexSeven.edges.size, 0)
    }

    @Test
    fun weightGraphShortestPathTest() {
        val graph = Graph()
        listOf("A", "B", "C", "D", "E", "F").forEach { graph.addVertex(it) }

        graph.addEdge("A", "A", 5)
        graph.addEdge("B", "C", 2)
        graph.addEdge("A", "D", 9)
        graph.addEdge("A", "E", 3)
        graph.addEdge("E", "F", 2)
        graph.addEdge("F", "D", 2)
        graph.addEdge("C", "D", 3)

        val solution = graph.shortestDistance("A", "D")
        Assertions.assertEquals(solution.first, 7)
        Assertions.assertEquals(solution.second.map { it.id }, listOf("A", "E", "F", "D"))

    }
}