package leetcode.recursion

import leetcode.binarytrees.TreeNode

class SearchBst {

    fun searchBST(node: TreeNode?, `val`: Int): TreeNode? {
        return when {
            node == null -> return node
            node.`val` == `val` -> return node
            `val` > node.`val` -> searchBST(node.right, `val`)
            else -> searchBST(node.left, `val`)
        }

    }
}
