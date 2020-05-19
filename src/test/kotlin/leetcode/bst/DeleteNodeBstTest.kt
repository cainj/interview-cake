package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DeleteNodeBstTest {

    @Test
    fun deleteNode() {
        val dn = DeleteNodeBst()
        val tree = TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7, TreeNode(6), TreeNode(9)))
        assertEquals(
            TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7, TreeNode(6))),
            dn.deleteNode(tree, 9)
        )
        assertEquals(
            TreeNode(6, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7)),
            dn.deleteNode(tree, 4)
        )
    }
}
