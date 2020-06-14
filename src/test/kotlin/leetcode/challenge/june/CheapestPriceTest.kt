package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheapestPriceTest {

    @Test
    fun findCheapestPrice() {
        val cheapestPrice = CheapestPrice()
        assertEquals(
            200,
            cheapestPrice.findCheapestPrice(
                3,
                arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)),
                0,
                2,
                1
            )
        )
        assertEquals(
            500,
            cheapestPrice.findCheapestPrice(
                3,
                arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)),
                0,
                2,
                0
            )
        )
        assertEquals(
            -1,
            cheapestPrice.findCheapestPrice(
                3,
                arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100)),
                0,
                2,
                0
            )
        )
    }
}
