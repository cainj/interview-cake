package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TreeRowLargestValueTest {

    @Test
    fun largestValues() {
        val lv = TreeRowLargestValue()
        assertEquals(emptyList<Int>(), lv.largestValues(null))
        assertEquals(listOf(1), lv.largestValues(TreeNode(1)))
        assertEquals(
            listOf(1, 3, 9, 100, 19), lv.largestValues(
                TreeNode(
                    1,
                    TreeNode(3, TreeNode(5, TreeNode(2, TreeNode(19))), TreeNode(3)),
                    TreeNode(2, TreeNode(9, TreeNode(100, TreeNode(-1))))
                )
            )
        )
    }
}
