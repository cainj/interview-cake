package leetcode.challenge.june

import leetcode.binarytrees.TreeNode
import java.util.*

class InvertedTree {

    fun invertTree(tree: TreeNode?): TreeNode? {

        val root = tree ?: return tree
        val deque: Queue<TreeNode> = ArrayDeque()
        deque.offer(root)

        while (deque.isNotEmpty()) {
            val node = deque.poll()

            val hold = node.left
            node.left = node.right
            node.right = hold

            if (node.left != null) deque.offer(node.left)
            if (node.right != null) deque.offer(node.right)
        }
        return root
    }
}
