package leetcode.bst

import leetcode.binarytrees.TreeNode

class InorderSuccessorBst {

    private var inorder = mutableListOf<TreeNode>()

    fun inorderSuccessor(root: TreeNode?, p: TreeNode?): TreeNode? {
        if (root == null) return null
        else {
            //build inorder
            doInorder(root)
            for (i in inorder.indices)
                if (inorder[i].`val` == p!!.`val` && i != inorder.size - 1)
                    return inorder[i + 1]

            return null
        }
    }

    private fun doInorder(node: TreeNode?) {
        if (node == null) return
        doInorder(node.left)
        inorder.add(node)
        doInorder(node.right)

    }
}
