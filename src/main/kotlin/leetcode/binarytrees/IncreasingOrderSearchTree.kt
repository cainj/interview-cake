package leetcode.binarytrees

class IncreasingOrderSearchTree {

    fun increasingBST(root: TreeNode?): TreeNode? {
        val ans = TreeNode(0);
        current = ans;
        dfs(root)
        return ans.right
    }

    private var current: TreeNode? = null
    private fun dfs(node: TreeNode?) {

        if (node == null) return

        dfs(node.left)
        node.left = null
        current?.right = node
        current = node
        dfs(node.right)
    }
}
