package leetcode.bst

import leetcode.binarytrees.TreeNode

class RangeSum {
    private var ans = 0

    fun rangeSumBST(tree: TreeNode?, L: Int, R: Int): Int = dfs(tree, L, R)

    private fun dfs(node: TreeNode?, L: Int, R: Int): Int {
        if (node == null) return ans
        if (node.`val` in L..R) ans += node.`val`
        if (L < node.`val`) dfs(node.left, L, R)
        if (node.`val` < R) dfs(node.right, L, R)
        return ans
    }
}
