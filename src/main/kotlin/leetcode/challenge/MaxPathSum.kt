package leetcode.challenge

import leetcode.binarytrees.TreeNode
import kotlin.math.max

class MaxPathSum {

    var max = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        helper(root)
        return max
    }

    private fun helper(node: TreeNode?): Int {
        if (node == null)
            return 0

        val left = max(0, helper(node.left))
        val right = max(0, helper(node.right))
        max = max(max, left + right + node.`val`)
        return max(left, right) + node.`val`
    }
}
