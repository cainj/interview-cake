package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class TwoSumIITest {

    @Test
    fun twoSum() {
        val ts = TwoSumII()
        assertArrayEquals(intArrayOf(1, 2), ts.twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(3, 4), ts.twoSum(intArrayOf(2, 7, 11, 15), 26))
        assertArrayEquals(intArrayOf(2, 3), ts.twoSum(intArrayOf(2, 7, 11, 15), 18))
        assertArrayEquals(intArrayOf(1, 4), ts.twoSum(intArrayOf(2, 7, 11, 15), 17))
    }
}
