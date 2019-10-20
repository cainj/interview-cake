package interviewcake

import leetcode.twoSum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {

    // tests

    @Test
    fun simpleTwoSumTest() {
        val expected = intArrayOf(0, 1)
        val actual = twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assertions.assertArrayEquals(actual, expected)
    }
}