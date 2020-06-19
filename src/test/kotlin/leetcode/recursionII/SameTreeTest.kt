package leetcode.recursionII

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SameTreeTest {

    @Test
    fun isSameTree() {
        val sameTree = SameTree()
        var tree = TreeNode(1, TreeNode(2))
        var tree2 = TreeNode(1, TreeNode(2))
        assertEquals(true, sameTree.isSameTree(tree, tree2))
        tree2 = TreeNode(2, TreeNode(1))
        assertEquals(false, sameTree.isSameTree(tree, tree2))
        tree  = TreeNode(2, right = TreeNode(1))
        assertEquals(false, sameTree.isSameTree(tree, tree2))
    }
}
