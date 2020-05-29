package leetcode.recursionII

import leetcode.binarytrees.TreeNode

class ValidBst {
    fun isValidBST(tree: TreeNode?): Boolean {
        val root = tree ?: return true
        return validate(root)
    }

    private fun validate(node: TreeNode?, min: Int? = null, max: Int? = null): Boolean {
        if (node == null) return true

        if (min != null && node.`val` <= min) return false
        if (max != null && node.`val` >= max) return false

        return validate(node.left, min, node.`val`) && validate(node.right, node.`val`, max)
    }
}
