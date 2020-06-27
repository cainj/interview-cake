package leetcode.challenge.june

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SumRootTest {

    @Test
    fun sumNumbers() {
        val sr = SumRoot()
        var tree = TreeNode(1, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(25, sr.sumNumbers(tree))
        tree = TreeNode(4, TreeNode(9, TreeNode(5), TreeNode(1)), TreeNode(0))
        Assertions.assertEquals(1051, sr.sumNumbers(tree))
    }
}
