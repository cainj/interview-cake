package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MergeSortTest {

    @Test
    fun sortArray() {
        val sortArray = MergeSort()
        assertArrayEquals(intArrayOf(1, 2, 3, 5), sortArray.sortArray(intArrayOf(5, 2, 3, 1)))
        assertArrayEquals(intArrayOf(0), sortArray.sortArray(intArrayOf(0)))
        assertArrayEquals(intArrayOf(), sortArray.sortArray(intArrayOf()))
        assertArrayEquals(
            intArrayOf(1, 3, 4, 5, 11, 12, 21, 31, 55, 66, 114, 1000),
            sortArray.sortArray(intArrayOf(1, 3, 4, 5, 11, 12, 21, 31, 114, 55, 66, 1000))
        )
    }
}
