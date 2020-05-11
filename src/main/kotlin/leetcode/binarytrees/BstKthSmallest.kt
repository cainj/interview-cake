package leetcode.binarytrees

class BstKthSmallest {

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if (root == null) return 0

        val lowest = mutableListOf<Int>()
        inorder(root, lowest)
        return lowest[k - 1]
    }

    private fun inorder(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return

        inorder(node.left, list)
        list.add(node.`val`)
        inorder(node.right, list)
    }
}
