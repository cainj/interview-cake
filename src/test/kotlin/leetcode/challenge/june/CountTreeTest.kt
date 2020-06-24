package leetcode.challenge.june

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountTreeTest {

    @Test
    fun countNodes() {
        val countTree = CountTree()
        var tree = TreeNode(3, left = TreeNode(9), right = TreeNode(20, left = TreeNode(15), right = TreeNode(7)))
        assertEquals(5, countTree.countNodes(tree))
        tree = TreeNode(
            3,
            left = TreeNode(9, TreeNode(3), TreeNode(4)),
            right = TreeNode(20, left = TreeNode(15), right = TreeNode(7))
        )
        assertEquals(7, countTree.countNodes(tree))
    }
}
