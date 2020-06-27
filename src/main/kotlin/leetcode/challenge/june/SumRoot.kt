package leetcode.challenge.june

import leetcode.binarytrees.TreeNode

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * Find the total sum of all root-to-leaf numbers.
 *
 *  Example:
 *  Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 *  Output: 25
 *  Explanation:
 *  The root-to-leaf path 1->2 represents the number 12.
 *  The root-to-leaf path 1->3 represents the number 13.
 *  Therefore, sum = 12 + 13 = 25.
 *
 *  Example 2:
 *  Input: [4,9,0,5,1]
*       4
*      / \
*     9   0
*    / \
*   5   1
*  Output: 1026
*  Explanation:
*  The root-to-leaf path 4->9->5 represents the number 495.
*  The root-to-leaf path 4->9->1 represents the number 491.
*  The root-to-leaf path 4->0 represents the number 40.
*  Therefore, sum = 495 + 491 + 40 = 1026.
*/
class SumRoot {
    private var ans = 0

    fun sumNumbers(root: TreeNode?): Int {
        sumHelper(root, 0)
        return ans
    }

    private fun sumHelper(node: TreeNode?, num: Int) {
        var currNumber = num
        if (node != null) {
            currNumber = currNumber * 10 + node.`val`
            if (node.left == null && node.right == null) ans += num * 10 + node.`val`
            sumHelper(node.left, currNumber)
            sumHelper(node.right, currNumber)
        }
    }


}
