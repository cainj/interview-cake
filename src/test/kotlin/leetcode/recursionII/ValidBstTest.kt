package leetcode.recursionII

import leetcode.binarytrees.TreeNode
import leetcode.bst.ValidateBst
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidBstTest {

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
