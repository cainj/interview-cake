package leetcode.recursionII

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuickSortTest {

    @Test
    fun quickSort() {
        val sort = QuickSort()
        assertArrayEquals(intArrayOf(1, 2, 3, 5), sort.quickSort(intArrayOf(5, 2, 3, 1)))
        assertArrayEquals(intArrayOf(0), sort.quickSort(intArrayOf(0)))
        assertArrayEquals(intArrayOf(), sort.quickSort(intArrayOf()))
        assertArrayEquals(
            intArrayOf(1, 3, 4, 5, 11, 12, 21, 31, 55, 66, 114, 1000),
            sort.quickSort(intArrayOf(1, 3, 4, 5, 11, 12, 21, 31, 114, 55, 66, 1000))
        )
    }
}
