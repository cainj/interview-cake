package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountUnivalueTest {

    @Test
    fun countUnivalSubtrees() {
        val uv = CountUnivalue()
        var tree = TreeNode(1)
        assertEquals(1, uv.countUnivalSubtrees(tree))
        tree = TreeNode(3, TreeNode(1), TreeNode(1))
        assertEquals(2, uv.countUnivalSubtrees(tree))
        tree = TreeNode(3, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(2, TreeNode(4), TreeNode(3)))
        assertEquals(4, uv.countUnivalSubtrees(tree))
        tree = TreeNode(1, TreeNode(5, TreeNode(5), TreeNode(5)), TreeNode(5, TreeNode(5), TreeNode(5)))
        assertEquals(6, uv.countUnivalSubtrees(tree))
    }
}
