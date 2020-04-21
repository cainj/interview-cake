package leetcode.challenge

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BstFromPreorderTest {

    @Test
    fun bstFromPreorder() {
        val bfp = BstFromPreorder()
        val tree = TreeNode(
            8,
            left = TreeNode(5, left = TreeNode(1), right = TreeNode(7)),
            right = TreeNode(10, right = TreeNode(12))
        )
        assertEquals(tree, bfp.bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12)))
    }
}