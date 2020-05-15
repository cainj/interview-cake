package leetcode.bst

import leetcode.binarytrees.TreeNode

class ValidateBst {
    fun isValidBST(root: TreeNode?): Boolean =
        if (root == null) true
        else helper(root, null, null)

    private fun helper(node: TreeNode?, maxValue: Int?, minValue: Int?): Boolean {
        if (node == null) return true

        if (null != minValue && node.`val` <= minValue) return false
        if (null != maxValue && node.`val` >= maxValue) return false

        return helper(node.left, node.`val`, minValue) && helper(node.right, maxValue, node.`val`)
    }
}
