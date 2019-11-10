package interviewcake

import utils.swap
import kotlin.random.Random

fun colorGraph(graph: Array<GraphNode>, colors: Array<String>) {

    val d = graph.size
    val setOfColors = colors.copyOfRange(0, d + 1)
    val allowedColors = shuffle(setOfColors)

    for (node in graph)
        paint(node, allowedColors)
}

private fun shuffle(array: Array<String>): Set<String> {
    for (i in array.indices)
        swap(random(i, array.size), array.size - 1, array)
    return array.toSet()
}

private fun random(floor: Int, ceiling: Int) = Random.nextInt(floor, ceiling)

fun paint(node: GraphNode, allowedColors: Set<String>) {

    val neighbors = node.unColoredNeighbors()
    val availableColors = node.legalColors(allowedColors)
    require(!neighbors.contains(node)) { "Legal coloring impossible for node with loop: $node.label}" }

    if (!node.hasColor())
        node.setColor(availableColors.elementAt(0))
    if (neighbors.isEmpty())
        return
    else
        neighbors.forEach { paint(it, allowedColors) }

}
