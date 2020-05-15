package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidateBstTest {

    @Test
    fun isValidBST() {
        val validBst = ValidateBst()
        assertEquals(true, validBst.isValidBST(TreeNode(0)))
        assertEquals(false, validBst.isValidBST(TreeNode(1, TreeNode(1))))
        assertEquals(true, validBst.isValidBST(TreeNode(Int.MIN_VALUE, right = TreeNode(Int.MAX_VALUE))))
        assertEquals(false, validBst.isValidBST(TreeNode(Int.MIN_VALUE, TreeNode(3), TreeNode(Int.MAX_VALUE))))
        assertEquals(true, validBst.isValidBST(TreeNode(4, TreeNode(3), TreeNode(5))))
    }
}
