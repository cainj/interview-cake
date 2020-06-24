package leetcode.challenge.june

import leetcode.binarytrees.TreeNode

class CountTree {

    fun countNodes(root: TreeNode?): Int {
        root ?: return 0

        val l = goLeft(root)
        val r = goRight(root)

        return if (l == r) (Math.pow(2.0, l.toDouble())).toInt() - 1
        else 1 + (countNodes(root.left) + countNodes(root.right))
    }

    private fun goLeft(l: TreeNode?): Int {
        var left = l
        var lc = 0
        while (left != null) {
            left = left.left
            lc++
        }
        return lc
    }

    private fun goRight(r: TreeNode?): Int {
        var right = r
        var rc = 0
        while (right != null) {
            right = right.right
            rc++
        }
        return rc
    }
}
