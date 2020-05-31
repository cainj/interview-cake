package leetcode.contest

import leetcode.binarytrees.TreeNode

/**
 *
 * Given a binary tree where node values are digits from 1 to 9.
 * A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node
 * values in the path is a palindrome.  Return the number of pseudo-palindromic paths going
 * from the root node to leaf nodes.
 *  Example 1:
 *      2
 *     / \
 *    3   1
 *   / \   \
 *  3   1   1
 *
 *  Output
 *  There are three paths going from the root node to leaf nodes:
 *  the path [2,3,3], the path [2,1,1], and the path [2,3,1].
 *  Among these paths [2,3,3] and [2, 1, 1] pseudo-palindromic.
 *  [2, 3, 3] can be arranged as [3,2,3] and [1,2,1].
 *
 * Constraints:
 * The given binary tree will have between 1 and 10^5 nodes.
 * Node values are digits from 1 to 9.
 *
 *
 *  Note: TreeNode
 *  var ti = TreeNode(5)
 *  var v = ti.`val`
 *  Definition for a binary tree node.
 *
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class BinaryTreePalindrome {
    private val paths = mutableListOf<List<Int>>()

    fun pseudoPalindromicPaths(tree: TreeNode?): Int {
        val root = tree ?: return 0
        paths.clear()
        findPaths(root, listOf())
        //println(paths)rroo
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
