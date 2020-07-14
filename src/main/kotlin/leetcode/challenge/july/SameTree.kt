package leetcode.challenge.july

import leetcode.binarytrees.TreeNode

class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        // one of p and q is null
        if (q == null || p == null) return false
        if (p.`val` != q.`val`) return false
        return isSameTree(p.left, q.left) && isSameTree(p.right, q?.right)
    }
}
