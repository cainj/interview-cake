package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaximumSubArrayTest {

    private val sn = MaximumSubArray()

    @Test
    fun singleNumber() {
        Assertions.assertEquals(sn.maxSubArray(intArrayOf(1,2)), 3)
        Assertions.assertEquals(sn.maxSubArray(intArrayOf(-2, 1)), 1)
        Assertions.assertEquals(sn.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)), 6)
        Assertions.assertEquals(sn.maxSubArray(intArrayOf(1)), 1)
    }
}
