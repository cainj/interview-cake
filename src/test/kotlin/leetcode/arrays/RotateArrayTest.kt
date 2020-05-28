package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class RotateArrayTest {

    @Test
    fun rotate() {
        val rotate = RotateArray()
        var nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotate.rotate(nums, 3)
        assertArrayEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), nums)

        nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotate.rotate(nums, 120)
        assertArrayEquals(intArrayOf(7,1,2,3,4,5,6), nums)
    }
}
