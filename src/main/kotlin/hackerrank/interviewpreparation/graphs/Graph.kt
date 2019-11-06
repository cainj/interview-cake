package hackerrank.interviewpreparation.graphs

//class Graph<T> {
//    private val adjacencyMap = HashMap<T, HashSet<T>>()
//
//    fun addEdge(sourceVertex: T, destinationVertex: T) {
//        adjacencyMap
//            .computeIfAbsent(destinationVertex) { HashSet() }
//            .add(sourceVertex)
//        adjacencyMap
//            .computeIfAbsent(sourceVertex) { HashSet() }
//            .add(destinationVertex)
//    }
//
//    override fun toString(): String = StringBuffer().apply {
//        for (key in adjacencyMap.keys) {
//            append("$key -> ")
//            append(adjacencyMap[key]?.joinToString(", ", "[", "]\n"))
//        }
//    }.toString()
//
//}
//
//fun main(args: Array<String>) {
//    val graph = Graph<Int>()
//    graph.addEdge(0, 1)
//    graph.addEdge(1, 2)
//    graph.addEdge(4, 3)
//    graph.addEdge(3, 2)
//    graph.addEdge(3, 1)
//    graph.addEdge(4, 1)
//    graph.addEdge(0, 4)
//    println(graph)
//}