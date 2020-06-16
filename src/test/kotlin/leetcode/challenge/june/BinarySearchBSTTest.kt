package leetcode.challenge.june

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinarySearchBSTTest {

    @Test
    fun searchBST() {
        val searchBst = BinarySearchBST()
        val tree = TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(7, TreeNode(6), TreeNode(9)))
        assertEquals(tree, searchBst.searchBST(tree, 4))
        assertEquals(null, searchBst.searchBST(tree, 10))
        assertEquals(TreeNode(7, TreeNode(6), TreeNode(9)), searchBst.searchBST(tree, 7))
        assertEquals(null, searchBst.searchBST(null, 7))
    }
}
