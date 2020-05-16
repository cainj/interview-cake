package leetcode.bst

import leetcode.binarytrees.TreeNode
import java.util.*

class BSTIterator(root: TreeNode?) {

    private val inorder = LinkedList<TreeNode>()

    init {
        buildInorder(root)
    }

    /** @return the next smallest number */
    fun next(): Int {
        val top = inorder.pop()

        if (top.right != null)
            buildInorder(top.right)

        return top.`val`
    }

    /** @return whether we have a next smallest number */
    fun hasNext(): Boolean = inorder.size > 0

    private fun buildInorder(node: TreeNode?) {
        var root = node

        while (root != null) {
            inorder.push(root)
            root = root.left
        }
    }
}
