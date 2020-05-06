package leetcode.stacks

class Node(
    val `val`: Int, val neighbors: ArrayList<Node?> = ArrayList()
)

class CloneGraph {
    private val visited = hashMapOf<Node, Node>()

    fun cloneGraph(node: Node?): Node? {
        if (node == null) return node

        if (visited.contains(node))
            return visited[node]

        val clone = Node(node.`val`)
        visited[node] = clone

        for (neighbor in node.neighbors)
            clone.neighbors.add(cloneGraph(neighbor))

        return clone
    }

    /**
     * Original solution
     *
     *

    var created = hashMapOf<Int, Node>()
    var visited = hashSetOf<Pair<Int, Int>>()
    fun cloneGraph(node: Node?): Node? {
        if(node == null) return node

        var root = if(created.contains(node.`val`)) created[node.`val`]!! else {
            val n = Node(node.`val`)
            created[n.`val`] = n
            n
        }

    for(neighbor in node.neighbors){
        val edge = node.`val` to neighbor!!.`val`
        if(!visited.contains(edge)){
        visited.add(edge)
        root.neighbors.add(cloneGraph(neighbor!!))
        }
    }

    return root
    }
     */
}
