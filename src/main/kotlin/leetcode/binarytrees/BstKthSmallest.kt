package leetcode.binarytrees

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 *
 *
 * Example 1:
 * Input: root = [3,1,4,null,2], k = 1
 *     3
 *    / \
 *   1   4
 *        \
 *         2
 *
 * Output: 1
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 *
 *  Output: 3
 *
 *  Constraints:
 *
 * The number of elements of the BST is between 1 to 10^4.
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
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
