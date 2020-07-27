package leetcode

import leetcode.binarytrees.TreeNode
import kotlin.math.min

class MinDepthTree {

    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        if (root.left == null && root.right == null) return 1

        var minDepth = Int.MAX_VALUE
        if (root.left != null) minDepth = min(minDepth(root.left), minDepth)
        if (root.right != null) minDepth = min(minDepth(root.right), minDepth)

        return minDepth + 1
    }
}
