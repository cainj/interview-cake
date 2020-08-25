package leetcode.challenge.august

import leetcode.binarytrees.TreeNode
import java.util.*

class SumLeftLeaves {

    fun sumOfLeftLeaves(root: TreeNode?): Int {
        val root = root ?: return 0
        var sum = 0

        val deque = ArrayDeque<TreeNode>()
        deque.offer(root)

        while (deque.isNotEmpty()) {
            val node = deque.poll()

            if (node.left != null) {
                if (node.left?.left == null && node.left?.right == null) sum += node.left!!.`val`
                deque.offer(node.left!!)
            }

            if (node.right != null) deque.offer(node.right!!)
        }

        return sum
    }

    private var sum = 0
    fun sumOfLeftLeavesRecursive(root: TreeNode?,isLeft:Boolean = false): Int {
        if(root == null) return 0
        if (root!!.left == null && root.right == null){
            return if(isLeft) root.`val` else 0
        }
        return sumOfLeftLeaves(root.left,true) + sumOfLeftLeaves(root.right,false)
    }
}
