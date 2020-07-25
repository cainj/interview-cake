package leetcode.challenge.july

import leetcode.binarytrees.TreeNode
import java.util.*

class BinaryTreeZigZag {

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val root = root ?: return emptyList()
        var level = 0
        val ans = mutableListOf<List<Int>>()
        val queue = ArrayDeque<LinkedList<TreeNode>>()
        queue.offer(LinkedList(listOf(root)))

        while (queue.isNotEmpty()) {
            val nodes = queue.poll()

            val children = LinkedList<TreeNode>()
            val result = mutableListOf<Int>()

            for (node in nodes) {
                result.add(node.`val`)
                if (level % 2 == 0) {
                    if (node.left != null) children.push(node.left)
                    if (node.right != null) children.push(node.right)
                } else {
                    if (node.right != null) children.push(node.right)
                    if (node.left != null) children.push(node.left)
                }
            }
            children.forEach { println(it.`val`) }
            if (children.isNotEmpty()) queue.offer(children)
            ans.add(result)
            level++
        }

        return ans
    }
}
