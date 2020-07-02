package leetcode.challenge.july

import leetcode.binarytrees.TreeNode
import java.util.*

class LevelOrder {

    fun levelOrderBottom(tree: TreeNode?): List<List<Int>> {
        val root = tree ?: return emptyList()
        val deque = ArrayDeque<List<TreeNode>>()
        val stack = LinkedList<List<Int>>()
        deque.offer(listOf(root))

        while (deque.isNotEmpty()) {
            val nodes = deque.poll()

            val children = mutableListOf<TreeNode>()
            val list = mutableListOf<Int>()
            for (node in nodes) {
                list.add(node.`val`)
                if (node.left != null) children.add(node.left!!)
                if (node.right != null) children.add(node.right!!)
            }
            if (list.isNotEmpty()) stack.push(list)
            if (children.isNotEmpty()) deque.add(children)
        }

        return stack
    }
}
