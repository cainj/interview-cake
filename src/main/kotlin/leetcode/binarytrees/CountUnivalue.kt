package leetcode.binarytrees

class CountUnivalue {

    fun countUnivalSubtrees(root: TreeNode?): Int {
        if (root == null) return 0
        val left = countUnivalSubtrees(root.left)
        val right = countUnivalSubtrees(root.right)
        return if (isUniValue(root, root.`val`)) 1 + left + right else left + right
    }

    private fun isUniValue(node: TreeNode?, value: Int): Boolean {
        if (node == null) return true
        if (node.`val` == value)
            return isUniValue(node.left, node.`val`) && isUniValue(node.right, node.`val`)
        return false
    }
}
