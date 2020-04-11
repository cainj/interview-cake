package leetcode.binarytrees

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryTreesTest {

    @Test
    fun preorderTraversal(){
        var tree = TreeNode(5, TreeNode(2), TreeNode(3))
        Assertions.assertEquals(listOf(5,2,3), preorderTraversal(tree, listOf()))
        tree = TreeNode(5, TreeNode(4, TreeNode(2), TreeNode(3)), TreeNode(8, TreeNode(6), TreeNode(7)))
        Assertions.assertEquals(listOf(5,4,2,3,8,6,7), preorderTraversal(tree, listOf()))
    }
}