package leetcode.contest

import leetcode.binarytrees.TreeNode
import kotlin.math.max

class GoodNodes {

    private var count = 0

    fun goodNodes(root: TreeNode?): Int {
        root ?: return 0
        count = 0
        maxOnPath(root, root.`val`)
        return count
    }

    private fun maxOnPath(node: TreeNode?, max: Int) {
        if (node == null) return
        if (node.`val` >= max) count++
        maxOnPath(node.left, max(node.`val`, max))
        maxOnPath(node.right, max(node.`val`, max))
    }
}
