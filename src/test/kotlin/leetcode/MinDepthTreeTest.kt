package leetcode

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinDepthTreeTest {

    @Test
    fun minDepth() {
        val minDepthTree = MinDepthTree()
        assertEquals(
            2,
            minDepthTree.minDepth(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))
        )
        assertEquals(
            2,
            minDepthTree.minDepth(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))))
        )
    }
}
