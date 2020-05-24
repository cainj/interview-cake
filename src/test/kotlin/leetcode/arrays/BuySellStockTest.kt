package leetcode.arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BuySellStockTest {

    @Test
    fun maxProfit() {
        val sell = BuySellStock()
        assertEquals(5, sell.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, sell.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, sell.maxProfit(intArrayOf(2, 1)))
        assertEquals(1, sell.maxProfit(intArrayOf(4, 5)))
        assertEquals(8, sell.maxProfit(intArrayOf(7, 1, 5, 3, 1, 9)))
    }
}
