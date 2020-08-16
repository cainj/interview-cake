package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BestSellStockIIITest {

    @Test
    fun maxProfit() {
        val bs = BestSellStockIII()
        assertEquals(6, bs.maxProfit(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)))
        assertEquals(4, bs.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, bs.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, bs.maxProfit(intArrayOf()))
    }
}
