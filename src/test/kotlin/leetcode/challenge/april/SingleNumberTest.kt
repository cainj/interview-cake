package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingleNumberTest {
    private val sn = SingleNumber()

    @Test
    fun singleNumber() {
        Assertions.assertEquals(sn.singleNumber(intArrayOf(4, 1, 2, 1, 2, 4, 3, 3, 9, 9, 8)), 8)
        Assertions.assertEquals(sn.singleNumberBit(intArrayOf(4, 1, 2, 1, 2, 4, 3, 3, 9, 9, 8)), 8)
        Assertions.assertEquals(sn.singleNumberSort(intArrayOf(4, 1, 2, 1, 2, 4, 3, 3, 9, 9, 8)), 8)
    }
}
