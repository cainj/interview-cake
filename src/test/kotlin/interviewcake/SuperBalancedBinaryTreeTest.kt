package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class SuperBalancedBinaryTreeTest {

    @Test
    fun fullTreeTest() {
        val root = BinaryTreeNode(5)
        val a = root.insertLeft(8)
        val b = root.insertRight(6)
        a.insertLeft(1)
        a.insertRight(2)
        b.insertLeft(3)
        b.insertRight(4)
        val result = isBalanced(root)
        assertTrue(result)
    }

    @Test
    fun bothLeavesAtTheSameDepthTest() {
        val root = BinaryTreeNode(3)
        root.insertLeft(4).insertLeft(1)
        root.insertRight(2).insertRight(9)
        val result = isBalanced(root)
        assertTrue(result)
    }

    @Test
    fun leafHeightsDifferByOneTest() {
        val root = BinaryTreeNode(6)
        root.insertLeft(1)
        root.insertRight(0).insertRight(7)
        val result = isBalanced(root)
        assertTrue(result)
    }

    @Test
    fun leafHeightsDifferByTwoTest() {
        val root = BinaryTreeNode(6)
        root.insertLeft(1)
        root.insertRight(0).insertRight(7).insertRight(8)
        val result = isBalanced(root)
        assertFalse(result)
    }

    @Test
    fun bothSubTreesSuperbalancedTest() {
        val root = BinaryTreeNode(1)
        root.insertLeft(5)
        val b = root.insertRight(9)
        b.insertLeft(8).insertLeft(7)
        b.insertRight(5)
        val result = isBalanced(root)
        assertFalse(result)
    }

    @Test
    fun bothSubTreesSuperbalancedTwoTest() {
        val root = BinaryTreeNode(1)
        val a = root.insertLeft(2)
        a.insertLeft(3)
        a.insertRight(7).insertRight(8)
        root.insertRight(4).insertRight(5).insertRight(6).insertRight(9)
        val result = isBalanced(root)
        assertFalse(result)
    }

    @Test
    fun onlyOneNodeTest() {
        val root = BinaryTreeNode(1)
        val result = isBalanced(root)
        assertTrue(result)
    }

    @Test
    fun treeIsLinkedListTest() {
        val root = BinaryTreeNode(1)
        root.insertRight(2).insertRight(3).insertRight(4)
        val result = isBalanced(root)
        assertTrue(result)
    }
}