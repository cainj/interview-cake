package leetcode.binarysearch

import leetcode.binarytrees.TreeNode
import kotlin.math.abs

class ClosestBinarySearchTree {

    fun closestValue(root: TreeNode?, target: Double): Int {
        return findBounds(root, root!!.`val`, target)
    }

    private fun findBounds(node: TreeNode?, closest: Int, target: Double): Int {
        if (node == null) return closest

        val c = if (abs(node.`val`.toDouble() - target) >= abs(closest.toDouble() - target)) closest else node.`val`

        return if (node.`val` > target) findBounds(node.left, c, target)
        else findBounds(node.right, c, target)
    }
}
