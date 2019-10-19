package interviewcake

import java.util.*
import kotlin.math.abs
import kotlin.math.max

// determine if the tree is superbalanced
fun isBalanced(treeRoot: BinaryTreeNode): Boolean {
    // get the height of the shortest path
    // get the height of the longest path
    // then take the difference of left height vs right height
    val l = shortestPath(treeRoot)
    val s = longestPath(treeRoot, 0)
    return depthNodePair(treeRoot)
}

private fun depthNodePair(treeRoot: BinaryTreeNode?): Boolean {
    if (treeRoot == null) return true

    val depths = mutableListOf<Int>()
    val queue: ArrayDeque<NodeDepthPair> = ArrayDeque()
    queue.push(NodeDepthPair(treeRoot, 0))

    while (queue.isNotEmpty()) {
        val pair = queue.pop()
        val node = pair.node
        val depth = pair.depth

        if (isLeafNode(node)) {

            if (!depths.contains(depth)) {
                depths.add(depth)
            }

            if (depths.size > 2 || (depths.size == 2
                        && abs(depths[0] - depths[1]) > 1)
            ) {
                return false
            }

        } else {
            if (node.left != null)
                queue.push(NodeDepthPair(node.left!!, depth + 1))
            if (node.right != null)
                queue.push(NodeDepthPair(node.right!!, depth + 1))
        }
    }

    return true

}

fun longestPath(node: BinaryTreeNode?, height: Int): Int {
    return when {
        null == node -> height
        isLeafNode(node) -> height
        else -> max(longestPath(node.right, height + 1), longestPath(node.left, height + 1))
    }
}

fun shortestPath(treeRoot: BinaryTreeNode?): Int {

    if (treeRoot == null) return 0

    val queue: ArrayDeque<List<BinaryTreeNode>> = ArrayDeque()
    var height = 0
    var children: List<BinaryTreeNode>

    queue.push(mutableListOf(treeRoot))

    while (queue.isNotEmpty()) {
        children = queue.pop()
        val newChildren = mutableListOf<BinaryTreeNode>()
        for (child in children) {

            if (isLeafNode(child))
                return height

            if (child.left != null)
                newChildren.add(child.left!!)

            if (child.right != null)
                newChildren.add(child.right!!)
        }
        queue.push(newChildren)
        height++
    }
    return height
}

fun isLeafNode(node: BinaryTreeNode): Boolean = (node.right == null && node.left == null)
