package karat


/**
 *
 * Suppose we have some input data describing a graph of relationships between parents and children over multiple generations.
 * The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.
 *
 * For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
 *
 * 1   2    4
 *  \ /   / | \
 *   3   5  8  9
 *   \ / \     \
 *    6   7    11
 *
 *  3 -> []
 *  2 ->
 *  3 ->
 *
 * Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.
 * Sample input/output (pseudodata):
 *
 * parentChildPairs = [
 * (1, 3), (2, 3), (3, 6), (5, 6),
 * (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
 * ]
 *
 * Output may be in any order:
 * findNodesWithZeroAndOneParents(parentChildPairs) => [
 * [1, 2, 4],       // Individuals with zero parents\
 * [5, 7, 8, 9, 11] // Individuals with exactly one parent
 * ]
 *
 * n: number of pairs in the input
 * 2n -> n
 */

fun findNodesWithZeroAndOneParents(parentChildPairs: Array<IntArray>): Array<List<Int>> {
    val nodes = hashMapOf<Int, MutableList<Int>>()
    val potentialRoots = parentChildPairs.fold(hashSetOf<Int>()) { accum, next ->
        accum.add(next[0])
        accum
    }

    for (node in parentChildPairs) {
        potentialRoots.remove(node[1])
        if (nodes.containsKey(node[1]))
            nodes[node[1]]!!.add(node[0])
        else
            nodes[node[1]] = mutableListOf(node[0])
    }

    println(nodes)
    return arrayOf(potentialRoots.toList(), nodes.filter { it.value.size == 1 }.map { it.key })
}