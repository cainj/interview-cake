package leetcode.contest

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GoodNodesTest {

    @Test
    fun goodNodes() {
        val gn = GoodNodes()
        var tree = TreeNode(3, TreeNode(1, TreeNode(3)), TreeNode(4, TreeNode(1), TreeNode(5)))
        assertEquals(4, gn.goodNodes(tree))
        tree = TreeNode(1)
        assertEquals(1, gn.goodNodes(tree))
        tree = TreeNode(3, TreeNode(3, TreeNode(4), TreeNode(2)))
        assertEquals(3, gn.goodNodes(tree))
    }
}
