package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class IncreasingOrderSearchTreeTest {

    @Test
    fun printOrder() {
        val inOrderTree = IncreasingOrderSearchTree()
        val tree = TreeNode(5, TreeNode(2), TreeNode(7))
        val orderedTree = TreeNode(2, null, TreeNode(5, null, TreeNode(7)))
        Assertions.assertEquals(orderedTree, inOrderTree.increasingBST(tree))
    }
}
