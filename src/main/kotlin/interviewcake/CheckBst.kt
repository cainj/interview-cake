package interviewcake

import java.util.*

data class NodeBounds(val node: BinaryTreeNode, val lowerBounds: Int, val upperBounds: Int)

fun isBinarySearchTree(treeNode: BinaryTreeNode?): Boolean {
    if (treeNode == null) return false

    val inOrder = inOrder(treeNode, mutableListOf())
    val checkedByInOrder = inOrder == inOrder.sorted()

    return checkBst(treeNode) && checkBstRecursive(treeNode, Int.MIN_VALUE, Int.MAX_VALUE) && checkedByInOrder
}

fun checkBstRecursive(node: BinaryTreeNode?, left: Int, right: Int): Boolean {
    return when {
        node == null -> return true
        (node.value < left || node.value > right) -> return false
        else -> checkBstRecursive(node.left, left, node.value) && checkBstRecursive(node.right, node.value, right)
    }
}

fun checkBst(root: BinaryTreeNode): Boolean {
    //keep track of the range between each node
    //if the value of the node is not within the upper and lower bounds then short circuit return false
    val queue = ArrayDeque<NodeBounds>()
    queue.offer(NodeBounds(root, Int.MIN_VALUE, Int.MAX_VALUE))

    while (queue.isNotEmpty()) {

        val nodeWithBounds = queue.remove()
        val node = nodeWithBounds.node
        val upperBounds = nodeWithBounds.upperBounds
        val lowerBounds = nodeWithBounds.lowerBounds

        if (node.value < lowerBounds || node.value > upperBounds)
            return false

        if (node.left != null)
            queue.offer(NodeBounds(node.left!!, lowerBounds, node.value))

        if (node.right != null)
            queue.offer(NodeBounds(node.right!!, node.value, upperBounds))

    }

    return true
}

fun inOrder(node: BinaryTreeNode, nums: MutableList<Int>): List<Int> {
    if (node.left != null) inOrder(node.left!!, nums)
    nums.add(node.value)
    if (node.right != null) inOrder(node.right!!, nums)
    return nums
}
