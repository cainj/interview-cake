package interviewcake

import java.util.*


class GraphNode(val label: String) {
    private val neighbors: MutableSet<GraphNode>
    private var color: Optional<String>

    init {
        neighbors = HashSet()
        color = Optional.empty()
    }

    fun getNeighbors(): Set<GraphNode> {
        return Collections.unmodifiableSet(neighbors)
    }

    fun addNeighbor(neighbor: GraphNode) {
        neighbors.add(neighbor)
    }

    fun hasColor(): Boolean {
        return color.isPresent
    }

    fun getColor(): String? {
        return color.orElse(null)
    }

    fun setColor(color: String) {
        this.color = Optional.ofNullable(color)
    }

    fun unColoredNeighbors() = neighbors.filter { it.getColor().isNullOrEmpty() }

    fun legalColors(colors: Set<String>): Set<String> {
        val usedColors = neighbors.fold(hashSetOf<String>()) { accum, next ->
            if (next.hasColor())
                accum.add(next.getColor()!!)
            accum
        }
        if (hasColor())
            usedColors.add(getColor()!!)
        return colors.minus(usedColors)
    }

    override fun toString(): String {
        return "label: $label color: ${color.orElse("No color")}"
    }
}
