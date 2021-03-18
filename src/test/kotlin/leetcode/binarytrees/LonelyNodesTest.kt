package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LonelyNodesTest {

    @Test
    fun getLonelyNodes() {
        val lonelyNodes = LonelyNodes()
        var tree = TreeNode(9, TreeNode(3), TreeNode(11))
        assertEquals(true, lonelyNodes.getLonelyNodes(tree).containsAll(listOf()))
        tree = TreeNode(9, null, TreeNode(11))
        assertEquals(true, lonelyNodes.getLonelyNodes(tree).containsAll(listOf(11)))
        tree = TreeNode(5, TreeNode(3,null, TreeNode(4)), TreeNode(6, TreeNode(9), null))
        assertEquals(true, lonelyNodes.getLonelyNodes(tree).containsAll(listOf(4, 9)))
    }
}
