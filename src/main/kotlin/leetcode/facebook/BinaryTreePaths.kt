package leetcode.facebook

import leetcode.binarytrees.TreeNode

class BinaryTreePaths {
    private var paths = mutableListOf<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        val root = root ?: return emptyList()
        findPaths(root)
        return paths
    }

    private fun findPaths(node: TreeNode, str: String = "") {
        if (node.left == null && node.right == null) {
            paths.add(str.plus("${node.`val`}"))
            return
        }


        if (node.left != null) findPaths(node.left!!, str.plus("${node.`val`}->"))
        if (node.right != null) findPaths(node.right!!, str.plus("${node.`val`}->"))
    }
}
