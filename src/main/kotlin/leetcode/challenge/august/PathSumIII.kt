package leetcode.challenge.august

import leetcode.binarytrees.TreeNode

class PathSumIII {
    private var count = 0

    fun pathSum(root: TreeNode?, sum: Int): Int {
        if (root == null) return 0

        dfs(root, 0, sum)
        pathSum(root.left, sum)
        pathSum(root.right, sum)
        return count
    }

    private fun dfs(node: TreeNode?, accum: Int, target: Int) {
        if (node == null) return
        val sum = node.`val` + accum
        if (sum == target) count++
        dfs(node.left, sum, target)
        dfs(node.right, sum, target)
    }
}
