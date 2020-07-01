package leetcode.bst

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RangeSumTest {

    @Test
    fun rangeSumBST() {
        val range = RangeSum()
        assertEquals(0, range.rangeSumBST(null, 7, 15))
        assertEquals(
            32, range.rangeSumBST(
                TreeNode(10, TreeNode(5, TreeNode(3), TreeNode(7)), TreeNode(15, right = TreeNode(18))),
                7, 15
            )
        )
    }
}
