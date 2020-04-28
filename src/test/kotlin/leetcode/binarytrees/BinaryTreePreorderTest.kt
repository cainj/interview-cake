package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BinaryTreePreorderTest {

    @Test
    fun buildTree() {
        val btp = BinaryTreePreorder()
        val expected = TreeNode(3, left = TreeNode(9), right = TreeNode(20, left = TreeNode(15), right = TreeNode(7)))
        Assertions.assertEquals(expected, btp.buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)))
    }
}
