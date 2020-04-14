package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryTreesTest {

    @Test
    fun preorderTraversal() {
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(listOf(5, 2, 3), preorderTraversal(tree, listOf()))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(5, 4, 2, 3, 8, 6, 7), preorderTraversal(tree, listOf()))
    }

    @Test
    fun inorderTraversal() {
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(listOf(2, 5, 3), inorderTraversal(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(2, 4, 3, 5, 6, 8, 7), inorderTraversal(tree))
        tree = TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(8, TreeNode(6), TreeNode(9)))
        Assertions.assertEquals(listOf(2, 3, 4, 5, 6, 8, 9), inorderTraversal(tree))
    }

    @Test
    fun postorderTraversal() {
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(listOf(2, 3, 5), postorderTraversal(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(2, 3, 4, 6, 7, 8, 5), postorderTraversal(tree))
        tree = TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(8, TreeNode(6), TreeNode(9)))
        Assertions.assertEquals(listOf(2, 4, 3, 6, 9, 8, 5), postorderTraversal(tree))
    }

    @Test
    fun levelOrderTraversalTest() {
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(listOf(listOf(5), listOf(2, 3)), levelOrder(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(listOf(5), listOf(4, 8), listOf(2, 3, 6, 7)), levelOrder(tree))
        tree = TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(8, TreeNode(6), TreeNode(9)))
        Assertions.assertEquals(listOf(listOf(5), listOf(3, 8), listOf(2, 4, 6, 9)), levelOrder(tree))
    }

    @Test
    fun maxDepthTest() {
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(2, maxDepth(tree))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(3, maxDepth(tree))
        tree = TreeNode(5, TreeNode(3, TreeNode(2), TreeNode(4)), TreeNode(8, TreeNode(6), TreeNode(9, TreeNode(7))))
        Assertions.assertEquals(4, maxDepth(tree))
    }

    @Test
    fun isSymmetricTest() {
        Assertions.assertEquals(true, isSymmetric(null))
        var tree = TreeNode(1)
        Assertions.assertEquals(true, isSymmetric(tree))
        tree = TreeNode(1, TreeNode(2))
        Assertions.assertEquals(false, isSymmetric(tree))
        tree = TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(2, TreeNode(4), TreeNode(3)))
        Assertions.assertEquals(true, isSymmetric(tree))
        tree = TreeNode(1, TreeNode(2, right = TreeNode(3)), TreeNode(2, right = TreeNode(3)))
        Assertions.assertEquals(false, isSymmetric(tree))
    }
}
