package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinDifferenceBSTTest {

    @Test
    fun getMinimumDifference() {
        var root = TreeNode(1, right = TreeNode(3, TreeNode(2)))
        assertEquals(1, MinDifferenceBST().getMinimumDifference(root))
        root = TreeNode(90, TreeNode(12, TreeNode(8), TreeNode(85)), TreeNode(100, TreeNode(96)))
        assertEquals(4, MinDifferenceBST().getMinimumDifference(root))
    }
}
