package leetcode.challenge

import leetcode.binarytrees.TreeNode

class ValidSequence {

    fun isValidSequence(root: TreeNode?, arr: IntArray): Boolean {
        if (root == null) return false

        return checkSequence(0, root, arr)
    }

    private fun checkSequence(index: Int, node: TreeNode?, arr: IntArray): Boolean {
        if (node == null) return false
        else if (isLeaf(node) && index != arr.size - 1 || index >= arr.size) return false
        else if (node.`val` != arr[index]) return false
        else if (isLeaf(node) && index == arr.size - 1) return true

        return checkSequence(index + 1, node.left, arr) || checkSequence(index + 1, node.right, arr)

    }

    private fun isLeaf(node: TreeNode): Boolean = node.left == null && node.right == null
}
