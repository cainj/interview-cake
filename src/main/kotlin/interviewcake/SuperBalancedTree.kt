package interviewcake

import java.util.*
import kotlin.math.abs

data class NodeDepthPair(val node: BinaryTreeNode, val depth: Int)

fun isBalanced(treeRoot: BinaryTreeNode): Boolean = depthNodePair(treeRoot)

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

            if (!depths.contains(depth))
                depths.add(depth)

            if (depths.size > 2 || (depths.size == 2 && abs(depths[0] - depths[1]) > 1))
                return false

        } else {
            if (node.left != null)
                queue.push(NodeDepthPair(node.left!!, depth + 1))
            if (node.right != null)
                queue.push(NodeDepthPair(node.right!!, depth + 1))
        }
    }

    return true

}

fun isLeafNode(node: BinaryTreeNode): Boolean = (node.right == null && node.left == null)
