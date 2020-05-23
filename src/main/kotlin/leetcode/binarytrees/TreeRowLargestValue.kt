package leetcode.binarytrees

import java.util.*
import kotlin.math.max

class TreeRowLargestValue {

    fun largestValues(tree: TreeNode?): List<Int> {
        val root = tree ?: return emptyList()

        val ans = mutableListOf<Int>()
        val deque = ArrayDeque<TreeNode>()

        deque.add(root)

        while (deque.isNotEmpty()) {
            val size = deque.size
            var max: Int? = null

            for (i in 0 until size) {
                val node = deque.poll()

                max = if (max == null) node.`val` else max(max, node.`val`)

                if (node.left != null) deque.add(node.left!!)
                if (node.right != null) deque.add(node.right!!)
            }

            ans.add(max!!)
        }

        return ans
    }
}

