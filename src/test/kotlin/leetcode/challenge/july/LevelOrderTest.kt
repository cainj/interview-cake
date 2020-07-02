package leetcode.challenge.july

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LevelOrderTest {

    @Test
    fun levelOrderBottom() {
        val lob = LevelOrder()
        var tree: TreeNode? = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
        assertEquals(
            listOf(
                listOf(15, 7),
                listOf(9, 20),
                listOf(3)
            ), lob.levelOrderBottom(tree)
        )
        tree = null
        assertEquals(
            emptyList<Int>(), lob.levelOrderBottom(tree)
        )
    }
}
