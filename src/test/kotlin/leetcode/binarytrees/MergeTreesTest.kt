package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MergeTreesTest {

    @Test
    fun mergeTrees() {
        val mt = MergeTrees()
        val t1 = TreeNode(1, TreeNode(3, TreeNode(5)), TreeNode(2))
        assertEquals(t1, mt.mergeTrees(t1, null))
        val t2 = TreeNode(2, TreeNode(1, right = TreeNode(4)), TreeNode(3, right = TreeNode(7)))
        assertEquals(
            TreeNode(3, TreeNode(4, TreeNode(5), TreeNode(4)), TreeNode(5, right = TreeNode(7))),
            mt.mergeTrees(t1, t2)
        )
    }
}
