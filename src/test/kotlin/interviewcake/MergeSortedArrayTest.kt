package interviewcake

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    // tests

    @Test
    fun bothArraysAreEmptyTest() {
        val myArray = intArrayOf()
        val alicesArray = intArrayOf()
        val expected = intArrayOf()
        val actual = mergeArrays(myArray, alicesArray)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun firstArrayIsEmptyTest() {
        val myArray = intArrayOf()
        val alicesArray = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 2, 3)
        val actual = mergeArrays(myArray, alicesArray)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun secondArrayIsEmptyTest() {
        val myArray = intArrayOf(5, 6, 7)
        val alicesArray = intArrayOf()
        val expected = intArrayOf(5, 6, 7)
        val actual = mergeArrays(myArray, alicesArray)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun bothArraysHaveSomeNumbersTest() {
        val myArray = intArrayOf(2, 4, 6)
        val alicesArray = intArrayOf(1, 3, 7)
        val expected = intArrayOf(1, 2, 3, 4, 6, 7)
        val actual = mergeArrays(myArray, alicesArray)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun arraysAreDifferentLengthsTest() {
        val myArray = intArrayOf(2, 4, 6, 8)
        val alicesArray = intArrayOf(1, 7)
        val expected = intArrayOf(1, 2, 4, 6, 7, 8)
        val actual = mergeArrays(myArray, alicesArray)
        assertArrayEquals(expected, actual)
    }
}