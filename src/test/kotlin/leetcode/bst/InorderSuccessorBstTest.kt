package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class InorderSuccessorBstTest {

    @Test
    fun inorderSuccessor() {
        val isSucc = InorderSuccessorBst()
        val tree = TreeNode(4, TreeNode(3), TreeNode(5))
        assertEquals(null, isSucc.inorderSuccessor(tree, TreeNode(5)))
        assertEquals(TreeNode(5), isSucc.inorderSuccessor(tree, TreeNode(4)))
        assertEquals(TreeNode(4), isSucc.inorderSuccessor(tree, TreeNode(3)))
    }
}
