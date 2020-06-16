package leetcode.challenge.june

import leetcode.binarytrees.TreeNode

class BinarySearchBST {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? =
        when {
            root == null -> null
            `val` == root.`val` -> root
            `val` < root.`val` -> searchBST(root.left, `val`)
            else -> searchBST(root.right, `val`)
        }
}
