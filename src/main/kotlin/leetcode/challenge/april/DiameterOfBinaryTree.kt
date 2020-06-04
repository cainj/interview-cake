package leetcode.challenge.april

import leetcode.binarytrees.TreeNode
import kotlin.math.max

class DiameterOfBinaryTree {
    var max = 1

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        height(root)
        return max - 1
    }

    private fun height(node: TreeNode?): Int =
        if (node == null)
            0
        else {
            val l = height(node.left)
            val r = height(node.right)
            max = max(l + r + 1, max)
            max(l, r) + 1
        }

}
