package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BalancedTreeTest {

    @Test
    fun isBalanced() {
        val balancedTree = BalancedTree()
        var tree = TreeNode(3)
        assertEquals(true, balancedTree.isBalanced(tree))
        tree = TreeNode(3, TreeNode(4), TreeNode(5))
        assertEquals(true, balancedTree.isBalanced(tree))
        assertEquals(true, balancedTree.isBalanced(null))
        tree = TreeNode(3, TreeNode(4), TreeNode(5, TreeNode(4, TreeNode(6))))
        assertEquals(false, balancedTree.isBalanced(tree))
    }
}
