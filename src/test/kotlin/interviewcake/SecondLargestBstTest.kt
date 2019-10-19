package interviewcake

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class SecondLargestBstTest {

    @Test
    fun myTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        val b = root.insertRight(70)
        b.insertLeft(60)
        b.insertRight(80)
        val actual = findSecondLargest(root)
        val expected = 70
        assertEquals(expected, actual)
    }

    @Test
    fun findSecondLargestTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        val b = root.insertRight(70)
        b.insertLeft(60)
        b.insertRight(80)
        val actual = findSecondLargest(root)
        val expected = 70
        assertEquals(expected, actual)
    }

    @Test
    fun largestHasLeftChildTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        root.insertRight(70).insertLeft(60)
        val actual = findSecondLargest(root)
        val expected = 60
        assertEquals(expected, actual)
    }

    @Test
    fun largestHasLeftSubtreeTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        val b = root.insertRight(70).insertLeft(60)
        b.insertLeft(55).insertRight(58)
        b.insertRight(65)
        val actual = findSecondLargest(root)
        val expected = 65
        assertEquals(expected, actual)
    }

    @Test
    fun secondLargestIsRootNodeTest() {
        val root = BinaryTreeNode(50)
        val a = root.insertLeft(30)
        a.insertLeft(10)
        a.insertRight(40)
        root.insertRight(70)
        val actual = findSecondLargest(root)
        val expected = 50
        assertEquals(expected, actual)
    }

    @Test
    fun descendingLinkedListTest() {
        val root = BinaryTreeNode(50)
        root.insertLeft(40).insertLeft(30).insertLeft(20)
        val actual = findSecondLargest(root)
        val expected = 40
        assertEquals(expected, actual)
    }

    @Test
    fun ascendingLinkedListTest() {
        val root = BinaryTreeNode(50)
        root.insertRight(60).insertRight(70).insertRight(80)
        val actual = findSecondLargest(root)
        val expected = 70
        assertEquals(expected, actual)
    }

    @Test
    fun exceptionWithTreeThatHasOneNodeTest() {
        val root = BinaryTreeNode(50)
        Assertions.assertThrows(Exception::class.java) { findSecondLargest(root) }
    }

    @Test
    fun exceptionWithEmptyTreeTest() {
        Assertions.assertThrows(Exception::class.java) { findSecondLargest(null) }
    }
}