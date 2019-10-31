package hacker_rank

class Node<T>(val data: T, var rank: Int = 0, var parent: Node<T>? = null)

class DisjointSetMatrix(private val machines: Array<Int>) : DisjointSet<Int>() {
    override fun union(that: Int, other: Int) {
        val parent1 = findSet(that)
        val parent2 = findSet(other)

        val node = nodes[parent1]
        val node2 = nodes[parent2]

        println("$parent1:$parent2")
        if (hasMachine(parent1!!)) {
            println("hasMachine $parent1")
            node2?.parent = node
        } else if (hasMachine(parent2!!)) {
            println("hasMachine $parent2")
            node?.parent = node2
        }
    }

    fun hasMachine(city: Int): Boolean = machines.contains(city)
}

open class DisjointSet<T> {
    protected val nodes = hashMapOf<T, Node<T>>()

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

    fun findSet(node: Node<T>?): Node<T>? {
        val parent = node?.parent
        if (parent == node)
            return parent

        node?.parent = findSet(parent)
        return node?.parent
    }

    open fun union(that: T, other: T) {
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

fun main() {
    val disjointSet = DisjointSet<Int>()

    disjointSet.makeSet(1)
    disjointSet.makeSet(2)
    disjointSet.makeSet(3)
    disjointSet.makeSet(4)
    disjointSet.makeSet(5)
    disjointSet.makeSet(6)
    disjointSet.makeSet(7)

    disjointSet.union(1, 2)
    disjointSet.union(2, 3)
    disjointSet.union(3, 4)
    disjointSet.union(4, 5)
    disjointSet.union(5, 8)
    disjointSet.union(6, 7)
    println(disjointSet.findSet(1))
    println(disjointSet.findSet(2))
    println(disjointSet.findSet(3))
    println(disjointSet.findSet(4))
    println(disjointSet.findSet(5))
    println(disjointSet.findSet(6))
    println(disjointSet.findSet(7))

}