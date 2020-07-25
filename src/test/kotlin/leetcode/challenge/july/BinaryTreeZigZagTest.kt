package leetcode.challenge.july

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinaryTreeZigZagTest {

    @Test
    fun zigzagLevelOrder() {
        val zigZag = BinaryTreeZigZag()
        val tree = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
        assertEquals(
            listOf(
                listOf(3),
                listOf(20, 9),
                listOf(15, 7)
            ),
            zigZag.zigzagLevelOrder(tree)
        )
    }
}
