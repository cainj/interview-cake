package leetcode.challenge.june

import leetcode.binarytrees.TreeNode
class SumRoot {
    private var ans = 0

    fun sumNumbers(root: TreeNode?): Int {
        sumHelper(root, 0)
        return ans
    }

    private fun sumHelper(node: TreeNode?, num: Int) {
        var currNumber = num
        if (node != null) {
            currNumber = currNumber * 10 + node.`val`
            if (node.left == null && node.right == null) ans += num * 10 + node.`val`
            sumHelper(node.left, currNumber)
            sumHelper(node.right, currNumber)
        }
    }
}
