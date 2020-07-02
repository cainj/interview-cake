package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class AveragePerLevelTest {

    @ExperimentalStdlibApi
    @Test
    fun averageOfLevels() {
        val apl = AveragePerLevel()
        var tree: TreeNode? = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
        assertArrayEquals(doubleArrayOf(3.00000, 14.50000, 11.00000), apl.averageOfLevels(tree))
        tree = null
        assertArrayEquals(doubleArrayOf(), apl.averageOfLevels(tree))
    }
}
