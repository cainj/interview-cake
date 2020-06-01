package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class InvertedTreeTest {

    @Test
    fun invertTree() {
        val it = InvertedTree()
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        assertEquals(TreeNode(5, TreeNode(3), TreeNode(2)), it.invertTree(tree))
        tree = TreeNode(5)
        assertEquals(TreeNode(5), it.invertTree(tree))
        assertEquals(null, it.invertTree(null))
    }
}
