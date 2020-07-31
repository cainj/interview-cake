package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BestSellStockTest {

    @Test
    fun maxProfit() {
        val bss = BestSellStock()
        assertEquals(3, bss.maxProfit(intArrayOf(1, 2, 3, 0, 2)))
        assertEquals(1, bss.maxProfit(intArrayOf(1, 2)))
        assertEquals(0, bss.maxProfit(intArrayOf(1)))
    }
}
