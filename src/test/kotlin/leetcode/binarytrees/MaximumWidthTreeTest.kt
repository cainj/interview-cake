package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximumWidthTreeTest {

    @Test
    fun widthOfBinaryTree() {
        val widthTree = MaximumWidthTree()
        assertEquals(0, widthTree.widthOfBinaryTree(null))
        assertEquals(1, widthTree.widthOfBinaryTree(TreeNode(1)))
        assertEquals(2, widthTree.widthOfBinaryTree(TreeNode(1, TreeNode(2), TreeNode(3))))
        assertEquals(
            4,
            widthTree.widthOfBinaryTree(
                TreeNode(
                    1,
                    TreeNode(2, TreeNode(4), TreeNode(5)),
                    TreeNode(3, TreeNode(3), TreeNode(6))
                )
            )
        )
        assertEquals(
            8,
            widthTree.widthOfBinaryTree(
                TreeNode(
                    1,
                    TreeNode(2, TreeNode(4, TreeNode(7)), TreeNode(5)),
                    TreeNode(3, TreeNode(3), TreeNode(6, right = TreeNode(10)))
                )
            )
        )
        assertEquals(
            1,
            widthTree.widthOfBinaryTree(
                TreeNode(
                    1,
                    right = TreeNode(3, right = TreeNode(1, right = TreeNode(4, right = TreeNode(6))))
                )
            )
        )
    }
}
