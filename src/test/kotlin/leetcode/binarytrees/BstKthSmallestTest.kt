package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BstKthSmallestTest {

    @Test
    fun kthSmallest() {
        val bstKthSmallest = BstKthSmallest()
        var tree = TreeNode(1)
        Assertions.assertEquals(1, bstKthSmallest.kthSmallest(tree, 1))
        tree = TreeNode(2, TreeNode(1))
        Assertions.assertEquals(1, bstKthSmallest.kthSmallest(tree, 1))
        tree = TreeNode(5, TreeNode(3, TreeNode(2, TreeNode(1)), TreeNode(4)), TreeNode(6, TreeNode(9), TreeNode(10)))
        Assertions.assertEquals(4, bstKthSmallest.kthSmallest(tree, 4))
    }
}
