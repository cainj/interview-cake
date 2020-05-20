package leetcode.bst

import leetcode.binarytrees.TreeNode

class SortedArrayBst {

    fun sortedArrayToBST(nums: IntArray): TreeNode? =
        if (nums.isEmpty()) null
        else helper(nums, 0, nums.size - 1)


    private fun helper(nums: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) return null

        // always choose left middle node as a root
        val p = (left + right) / 2

        // inorder traversal: left -> node -> right
        val root = TreeNode(nums[p])
        root.left = helper(nums, left, p - 1)
        root.right = helper(nums, p + 1, right)
        return root
    }
}
