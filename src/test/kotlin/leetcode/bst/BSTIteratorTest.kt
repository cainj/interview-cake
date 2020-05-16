package leetcode.bst

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BSTIteratorTest {

    @Test
    fun test() {
        val tree = leetcode.binarytrees.TreeNode(4, leetcode.binarytrees.TreeNode(3), leetcode.binarytrees.TreeNode(5))
        val iterator = BSTIterator(tree)

        assertEquals(true, iterator.hasNext())
        assertEquals(3, iterator.next())
        assertEquals(4, iterator.next())
        assertEquals(true, iterator.hasNext())
        assertEquals(5, iterator.next())
        assertEquals(false, iterator.hasNext())
    }
}
