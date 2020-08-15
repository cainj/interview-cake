package leetcode.binarytrees

class MergeTrees {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null

        val node = TreeNode((t1?.`val` ?: 0) + (t2?.`val` ?: 0))
        node.left = mergeTrees(t1?.left, t2?.left)
        node.right = mergeTrees(t1?.right, t2?.right)

        return node
    }
}
