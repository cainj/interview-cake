package leetcode.challenge.june

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MergeSortedArrayTest {

    @Test
    fun merge() {
        val msa = MergeSortedArray()
        val arr = intArrayOf(1, 2, 3, 0, 0, 0)
        msa.merge(arr, 3, intArrayOf(2, 5, 6), 3)
        Assertions.assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), arr)
    }
}
