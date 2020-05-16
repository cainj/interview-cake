package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BstInsertTest {

    @Test
    fun insertIntoBST() {
        val bstInsert = BstInsert()
        val tree = TreeNode(4, TreeNode(3), TreeNode(5))
        assertEquals(TreeNode(4, TreeNode(3), TreeNode(5, right = TreeNode(6))), bstInsert.insertIntoBST(tree, 6))
        assertEquals(TreeNode(4, TreeNode(3, TreeNode(2)), TreeNode(5)), bstInsert.insertIntoBST(tree, 2))
    }

    @Test
    fun insertRecursionBST() {
        val bstInsert = BstInsert()
        val tree = TreeNode(4, TreeNode(3), TreeNode(5))
        assertEquals(TreeNode(4, TreeNode(3), TreeNode(5, right = TreeNode(6))), bstInsert.insertRecursionBST(tree, 6))
        assertEquals(TreeNode(4, TreeNode(3, TreeNode(2)), TreeNode(5)), bstInsert.insertRecursionBST(tree, 2))
    }
}
