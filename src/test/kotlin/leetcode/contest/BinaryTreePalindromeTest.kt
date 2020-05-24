package leetcode.contest

import leetcode.binarytrees.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinaryTreePalindromeTest {

    @Test
    fun pseudoPalindromicPaths() {
        val pp = BinaryTreePalindrome()
        var tree = TreeNode(2, TreeNode(3, TreeNode(3), TreeNode(1)), TreeNode(1, TreeNode(1)))
        assertEquals(2, pp.pseudoPalindromicPaths(tree))
        tree = TreeNode(9)
        assertEquals(1, pp.pseudoPalindromicPaths(tree))
    }
}
