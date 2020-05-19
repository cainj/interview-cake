package leetcode.bst

import leetcode.binarytrees.TreeNode

class LowestCommonAncestorBst {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? =
        when {
            root!!.`val` > p!!.`val` && root.`val` > q!!.`val` -> lowestCommonAncestor(root.left, p, q)
            root.`val` < p.`val` && root.`val` < q!!.`val` -> lowestCommonAncestor(root.right, p, q)
            else -> root
        }
}
