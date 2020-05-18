package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LowestCommonAncestorBstTest {

    @Test
    fun lowestCommonAncestor() {
        val lcaBst = LowestCommonAncestorBst()
        val tree = TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7, TreeNode(6), TreeNode(9)))
        assertEquals(
            TreeNode(7, left = TreeNode(6, left = null, right = null), right = TreeNode(9, left = null, right = null)),
            lcaBst.lowestCommonAncestor(tree, TreeNode(9), TreeNode(6))
        )
        assertEquals(
            TreeNode(4),
            lcaBst.lowestCommonAncestor(tree, TreeNode(4), TreeNode(2))
        )
    }
}
