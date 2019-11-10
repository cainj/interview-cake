package hackerrank.interviewpreparation.graphs

class Node<T>(val data: T, var rank: Int = 0, var parent: Node<T>? = null)

class DisjointSet<T> {
    private val nodes = hashMapOf<T, Node<T>>()

    fun makeSet(data: T): Node<T> {
        val node = Node(data)
        node.parent = node
        nodes[data] = node
        return node
    }

    fun findSet(data: T): T? {
        val d = nodes.getOrPut(data, { makeSet(data) })
        return findSet(d)?.data
    }

    private fun findSet(node: Node<T>?): Node<T>? {
        val parent = node?.parent
        if (parent == node)
            return parent

        node?.parent = findSet(parent)
        return node?.parent
    }

    fun union(that: T, other: T) {
        val nodeThat = nodes[that]
        val nodeOther = nodes[other]

        val parent1 = findSet(nodeThat)
        val parent2 = findSet(nodeOther)

        if (parent1?.data == parent2?.data)
            return

        if (parent1!!.rank >= parent2!!.rank) {
            parent1.rank =
                if (parent1.rank == parent2.rank)
                    parent1.rank + 1
                else
                    parent1.rank
            parent2.parent = parent1
        } else {
            parent1.parent = parent2
        }

    }
}
