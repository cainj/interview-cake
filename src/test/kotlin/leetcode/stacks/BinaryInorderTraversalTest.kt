package leetcode.stacks

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BinaryInorderTraversalTest {

    @Test
    fun inorderTraversal() {
        val iot = BinaryInorderTraversal()
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))

        Assertions.assertEquals(listOf(2, 5, 3), iot.inorderTraversal(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(2, 4, 3, 5, 6, 8, 7), iot.inorderTraversal(tree))
        tree = TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(8, TreeNode(6), TreeNode(9)))
        Assertions.assertEquals(listOf(2, 3, 4, 5, 6, 8, 9), iot.inorderTraversal(tree))
        tree = TreeNode(2, TreeNode(3, TreeNode(4, TreeNode(5, TreeNode(6, TreeNode(7))))))
        Assertions.assertEquals(listOf(7, 6, 5, 4, 3, 2), iot.inorderTraversal(tree))
    }
}
