package leetcode.bst

import leetcode.binarytrees.TreeNode
import kotlin.math.abs
import kotlin.math.max

class BalancedTree {

    fun isBalanced(root: TreeNode?): Boolean =
        if (root == null) true
        else (abs(height(root.left) - height(root.right)) < 2) && isBalanced(root.left) && isBalanced(root.right)

    private fun height(node: TreeNode?): Int =
        if (node == null) -1
        else max(height(node.left), height(node.right)) + 1
}
