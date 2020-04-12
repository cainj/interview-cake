package leetcode.challenge

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DiameterOfBinaryTreeTest {

    @Test
    fun diameterOfTree() {
        val dbt = DiameterOfBinaryTree()
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(2, dbt.diameterOfBinaryTree(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(4, dbt.diameterOfBinaryTree(tree))
    }
}