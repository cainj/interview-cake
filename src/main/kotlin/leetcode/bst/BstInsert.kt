package leetcode.bst

import leetcode.binarytrees.TreeNode

class BstInsert {

    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return TreeNode(`val`)

        var node = root

        while (node != null) {
            if (node.`val` < `val`) {
                if (node.right != null) node = node.right
                else {
                    node.right = TreeNode(`val`)
                    break
                }
            } else {
                if (node.left != null) node = node.left
                else {
                    node.left = TreeNode(`val`)
                    break
                }
            }
        }
        return root
    }

    fun insertRecursionBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return TreeNode(`val`)
        if (root.`val` < `val`) root.right = insertRecursionBST(root.right, `val`)
        else root.left = insertRecursionBST(root.left, `val`)
        return root
    }
}
