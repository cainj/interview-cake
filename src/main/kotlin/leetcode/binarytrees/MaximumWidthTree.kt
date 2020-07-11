package leetcode.binarytrees

import java.util.*
import kotlin.math.max

/**
 * Given a binary tree, write a function to get the maximum width of the given tree.
 * The width of a tree is the maximum width among all levels. The binary tree has the same structure
 * as a full binary tree, but some nodes are null.
 *
 * The width of one level is defined as the length between the end-nodes
 * (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes
 * are also counted into the length calculation).
 *
 * Example 1:
 * Input:
 *      1
 *    /   \
 *   3     2
 *  / \     \
 * 5   3     9
 *
 * Output: 4
 * Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
 *
 * Example 2:
 *
 * Input:
 *       1
 *      /
 *     3
 *    / \
 *   5   3
 *
 *   Output: 2
 *   Explanation: The maximum width existing in the third level with the length 2 (5,3).
 *
 *   Example 3:
 *
 *   Input:
 *
 *        1
 *       / \
 *     3    2
 *    /
 *   5
 *
 * Output: 2
 * Explanation: The maximum width existing in the second level with the length 2 (3,2).
 *
 * Example 4:
 * Input:
 *
 *        1
 *       / \
 *      3   2
 *     /     \
 *    5       9
 *   /         \
 *  6           7
 *
 * Output: 8
 * Explanation: The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).
 *
 * */
class MaximumWidthTree {

    fun widthOfBinaryTree(tree: TreeNode?): Int {
        val root = tree ?: return 0
        var max = 0
        val deque = ArrayDeque<List<Pair<Int, TreeNode>>>()
        deque.offer(listOf(0 to root))

        while (deque.isNotEmpty()) {
            val pairs = deque.poll()
            val children = mutableListOf<Pair<Int, TreeNode>>()
            val first = pairs.first().first
            val last = pairs.last().first

            for (i in pairs.indices) {
                val (index, node) = pairs[i]

                if (node.left != null) children.add(index * 2 to node.left!!)
                if (node.right != null) children.add((index * 2) + 1 to node.right!!)
            }

            max = max(max, last - first + 1)
            if (children.isNotEmpty()) deque.offer(children)
        }

        return max
    }
}
