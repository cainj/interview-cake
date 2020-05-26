package leetcode.arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ConsecutiveOnesTest {

    @Test
    fun findMaxConsecutiveOnes() {
        val ones = ConsecutiveOnes()
        Assertions.assertEquals(3, ones.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
        Assertions.assertEquals(2, ones.findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)))
        Assertions.assertEquals(0, ones.findMaxConsecutiveOnes(intArrayOf()))
    }
}
