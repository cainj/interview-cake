package leetcode.challenge.august

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SumLeftLeavesTest {

    @Test
    fun sumOfLeftLeaves() {
        val sll = SumLeftLeaves()
        val tree = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
        assertEquals(24, sll.sumOfLeftLeaves(tree))
        assertEquals(0, sll.sumOfLeftLeaves(null))
    }
}
