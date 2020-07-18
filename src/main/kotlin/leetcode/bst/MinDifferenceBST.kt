package leetcode.bst

import leetcode.binarytrees.TreeNode

class MinDifferenceBST {
    private var sorted = mutableListOf<Int>()

    fun getMinimumDifference(root: TreeNode?): Int {
        var min = Int.MAX_VALUE
        inOrder(root)

        for (i in 0 until sorted.size - 1)
            min = Math.min(min, Math.abs(sorted[i] - sorted[i + 1]))

        return min
    }

    private fun inOrder(node: TreeNode?) {
        if (node == null) return
        inOrder(node.left)
        sorted.add(node.`val`)
        inOrder(node.right)
    }
}
