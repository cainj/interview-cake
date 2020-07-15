package leetcode.facebook

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinaryTreePathsTest {

    @Test
    fun binaryTreePaths() {
        val bt = BinaryTreePaths()
        assertEquals(
            hashSetOf("1->2->5", "1->3"),
            bt.binaryTreePaths(TreeNode(1, TreeNode(2, right = TreeNode(5)), TreeNode(3))).toSet()
        )
    }
}
