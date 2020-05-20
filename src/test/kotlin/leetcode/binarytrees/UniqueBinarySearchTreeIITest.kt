package leetcode.binarytrees

import leetcode.binarysearch.UniqueBinarySearchTreeII
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniqueBinarySearchTreeIITest {

    @Test
    fun generateTrees() {
        val ubst = UniqueBinarySearchTreeII()
        assertEquals(emptyList<TreeNode>(), ubst.generateTrees(0))
        assertEquals(listOf(TreeNode(1)), ubst.generateTrees(1))
        assertEquals(
            listOf(
                TreeNode(1, right = TreeNode(2, right = TreeNode(3))),
                TreeNode(1, right = TreeNode(3, left = TreeNode(2))),
                TreeNode(2, TreeNode(1), TreeNode(3)),
                TreeNode(3, TreeNode(2), TreeNode(1)),
                TreeNode(3, TreeNode(1, right = TreeNode(1)))
            )
            , ubst.generateTrees(3)
        )

    }
}
