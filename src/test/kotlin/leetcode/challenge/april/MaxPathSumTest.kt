package leetcode.challenge.april

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MaxPathSumTest {

    @Test
    fun maxPathSum() {
        val mps = MaxPathSum()
        Assertions.assertEquals(1, mps.maxPathSum(TreeNode(1)))
        Assertions.assertEquals(6, mps.maxPathSum(TreeNode(1, TreeNode(3), TreeNode(2))))
        Assertions.assertEquals(
            42,
            mps.maxPathSum(TreeNode(-10, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))
        )
    }
}
