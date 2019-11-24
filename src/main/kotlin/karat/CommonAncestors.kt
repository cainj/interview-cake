package karat

import java.util.*

/**
 *
 * Suppose we have some input data describing a graph of relationships
 * between parents and children over multiple generations.
 * The data is formatted as a list of (parent, child) pairs,
 * where each individual is assigned a unique integer identifier.
 *
 * For example, in this diagram, 6 and 8 have a common ancestor of 4.
 *          14    13
 *           |    |
 *   1   2   4    12
 *    \ /  / | \ /
 *     3   5 8  9
 *      \ / \    \
 *       6  7    11
 *       parentChildPairs1 = [
 *         (1, 3), (2, 3), (3, 6), (5, 6), (5, 7), (4, 5),
 *          (4, 8), (4, 9), (9, 11), (14, 4), (13, 12), (12, 9)
 *       ]
 *   6 -> 3, 5 parent and grand parent
 *   8 -> 4, 5
 */

fun hasCommonAncestor(parentChildPairs: Array<IntArray>, first: Int, second: Int): Boolean {
    val graph = parentChildPairs.fold(hashMapOf<Int, MutableList<Int>>()) { acc, next ->
        val list = acc.getOrDefault(next[1], mutableListOf())
        list.add(next[0])
        acc[next[1]] = list
        acc
    }

    val firstPaths = search(listOf(first), graph, setOf(first))
    val secondPaths = search(listOf(second), graph, setOf(second))
    val x = secondPaths.flatten()
    val y = firstPaths.flatten()
    return (x.size > 1 && y.size > 1) && x.intersect(y).isNotEmpty()
}

private fun search(
    paths: List<Int>,
    graph: HashMap<Int, MutableList<Int>>,
    visited: Set<Int>
): List<List<Int>> {
    val node = paths.last()
    return if (graph[node] == null) {
        listOf(paths)
    } else {
        val parents = graph[node]!!.filterNot { visited.contains(it) }
        parents.flatMap { search(paths.plus(it), graph, visited + it) }
    }
}
