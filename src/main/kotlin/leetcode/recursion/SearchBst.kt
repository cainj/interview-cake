package leetcode.recursion

import leetcode.binarytrees.TreeNode

class SearchBst {

    fun searchBST(node: TreeNode?, `val`: Int): TreeNode? =
        when {
            node == null -> node
            node.`val` == `val` -> node
            `val` > node.`val` -> searchBST(node.right, `val`)
            else -> searchBST(node.left, `val`)
        }

    fun searchBSTIter(root: TreeNode?, `val`: Int): TreeNode? {
        var node = root
        while (node != null) {
            if (node.`val` == `val`) break
            else if (node.`val` > `val`)
                node = node.left
            else
                node = node.right
        }
        return node
    }
}
