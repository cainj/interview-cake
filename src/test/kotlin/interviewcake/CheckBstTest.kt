package interviewcake

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test



class CheckBstTest {

    @Test
    fun validFullTreeTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        val b = root.insertRight(70)
        b.insertLeft(60)
        b.insertRight(80)
        val result = isBinarySearchTree(root)
        assertTrue(result)
    }

    @Test
    fun bothSubtreesValidTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(20)
        a.insertRight(60)
        val b = root.insertRight(80)
        b.insertLeft(70)
        b.insertRight(90)
        val result = isBinarySearchTree(root)
        assertFalse(result)
    }

    @Test
    fun descendingLinkedListTest() {
        val root = BinaryTreeNode(50)
        root.insertLeft(40).insertLeft(30).insertLeft(20).insertLeft(10)
        val result = isBinarySearchTree(root)
        assertTrue(result)
    }

    @Test
    fun outOfOrderLinkedListTest() {
        val root = BinaryTreeNode(50)
        root.insertRight(70).insertRight(60).insertRight(80)
        val result = isBinarySearchTree(root)
        assertFalse(result)
    }

    @Test
    fun oneNodeTreeTest() {
        val root = BinaryTreeNode(50)
        val result = isBinarySearchTree(root)
        assertTrue(result)
    }

}