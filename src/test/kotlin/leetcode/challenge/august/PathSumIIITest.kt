package leetcode.challenge.august

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PathSumIIITest {

    @Test
    fun pathSum() {
        val pathSum = PathSumIII()
        val tree = TreeNode(
            10, TreeNode(5, TreeNode(3, TreeNode(3), TreeNode(-2)), TreeNode(2, right = TreeNode(1)))
            , TreeNode(-3, right = TreeNode(11))
        )
        assertEquals(3, pathSum.pathSum(tree, 8))
        assertEquals(0, pathSum.pathSum(null, 8))
    }
}
