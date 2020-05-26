package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ArrayPairTest {

    @Test
    fun arrayPairSum() {
        val arraySum = ArrayPair()
        assertEquals(4, arraySum.arrayPairSum(intArrayOf(1, 4, 3, 2)))
        assertEquals(10, arraySum.arrayPairSum(intArrayOf(1, 4, 3, 2, 7, 6)))
        assertEquals(13, arraySum.arrayPairSum(intArrayOf(1, 4, 3, 2, 9, 9)))
    }
}
