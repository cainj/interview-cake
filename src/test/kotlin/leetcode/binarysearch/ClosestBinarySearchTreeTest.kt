package leetcode.binarysearch

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ClosestBinarySearchTreeTest {

    @Test
    fun closestValue() {
        val cv = ClosestBinarySearchTree()
        val tree = TreeNode(4, TreeNode(2, TreeNode(1), TreeNode(3)), TreeNode(5))
        assertEquals(4, cv.closestValue(tree, 3.75))
        assertEquals(3, cv.closestValue(tree, 3.05))
        assertEquals(1, cv.closestValue(tree, -1.09))
        assertEquals(9, cv.closestValue(TreeNode((9)), 100.0))
    }
}
