package leetcode.bst

import leetcode.binarytrees.TreeNode

class DeleteNodeBst {
    /** One step right and then always left */
    private fun successor(root: TreeNode): Int {
        var treeNode: TreeNode? = root
        treeNode = treeNode?.right
        while (treeNode?.left != null) treeNode = treeNode?.left
        return treeNode?.`val` ?: 0
    }

    /** One step left and then always right */
    private fun predecessor(root: TreeNode): Int {
        var treeNode: TreeNode? = root
        treeNode = treeNode?.left
        while (treeNode?.right != null) treeNode = treeNode.right
        return treeNode?.`val` ?: 0
    }

    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        var tree: TreeNode? = root ?: return null

        // delete from the right subtree
        if (key > tree!!.`val`) tree.right = deleteNode(tree.right, key) else if (key < tree.`val`) tree.left =
            deleteNode(tree.left, key) else {
            // the node is a leaf
            if (tree.left == null && tree.right == null) tree = null else if (tree.right != null) {
                tree.`val` = successor(tree)
                tree.right = deleteNode(tree.right, tree.`val`)
            } else {
                tree.`val` = predecessor(tree)
                tree.left = deleteNode(tree.left, tree.`val`)
            }
        }
        return tree
    }
}
