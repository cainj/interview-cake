package leetcode.contest

import leetcode.binarytrees.TreeNode

class BinaryTreePalindrome {
    private val paths = mutableListOf<List<Int>>()

    fun pseudoPalindromicPaths(tree: TreeNode?): Int {
        val root = tree ?: return 0
        paths.clear()
        findPaths(root, listOf())
        //println(paths)
        return paths.count { isPalindrome(it) }
    }

    private fun findPaths(root: TreeNode, path: List<Int>) {
        if (root.left == null && root.right == null) paths.add(path + root.`val`)
        if (root.left != null) findPaths(root.left!!, path + root.`val`)
        if (root.right != null) findPaths(root.right!!, path + root.`val`)
    }

    private fun isPalindrome(nodes: List<Int>): Boolean {
        val hash = hashSetOf<Int>()
        for (n in nodes)
            if (hash.contains(n)) hash.remove(n)
            else hash.add(n)
        return hash.size < 2
    }
}
