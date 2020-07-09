package leetcode.binarytrees


import java.util.*
import kotlin.math.max

class MaximumWidthTree {

    fun widthOfBinaryTree(tree: TreeNode?): Int {
        val root = tree ?: return 0
        var max = 0
        val deque = ArrayDeque<List<Pair<Int, TreeNode>>>()
        deque.offer(listOf(0 to root))

        while (deque.isNotEmpty()) {
            val pairs = deque.poll()
            val children = mutableListOf<Pair<Int, TreeNode>>()
            val first = pairs.first().first
            val last = pairs.last().first

            for (i in pairs.indices) {
                val (index, node) = pairs[i]

                if (node.left != null) children.add(index * 2 to node.left!!)
                if (node.right != null) children.add((index * 2) + 1 to node.right!!)
            }

            max = max(max, last - first + 1)
            if (children.isNotEmpty()) deque.offer(children)
        }

        return max
    }
}
