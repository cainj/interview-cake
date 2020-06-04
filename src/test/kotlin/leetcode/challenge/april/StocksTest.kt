package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StocksTest {
    private val sn = Stocks()

    @Test
    fun singleNumber() {
        Assertions.assertEquals(sn.maxProfit(intArrayOf(7,1,5,3,6,4)), 7)
        Assertions.assertEquals(sn.maxProfit(intArrayOf(1, 2)), 1)
        Assertions.assertEquals(sn.maxProfit(intArrayOf(7,6,4,3,1)), 0)
    }
}
