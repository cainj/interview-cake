package leetcode.stacks

import leetcode.binarytrees.TreeNode
import java.util.*

class BinaryInorderTraversal {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        val inorder = mutableListOf<Int>()
        val stack = LinkedList<TreeNode>()

        var currentNode = root
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode)
                currentNode = currentNode.left
            }
            currentNode = stack.pop()
            inorder.add(currentNode.`val`)
            currentNode = currentNode.right
        }

        return inorder
    }
}
