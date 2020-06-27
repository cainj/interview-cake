package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


class MaxProfitTest {


    @Test
    fun priceGoesUpThenDownTest() {
        val actual = getMaxProfit(intArrayOf(1, 5, 3, 2))
        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun priceGoesDownThenUpTest() {
        val actual = getMaxProfit(intArrayOf(7, 2, 8, 9))
        val expected = 7
        assertEquals(expected, actual)
    }

    @Test
    fun priceGoesUpAllDayTest() {
        val actual = getMaxProfit(intArrayOf(1, 6, 7, 9))
        val expected = 8
        assertEquals(expected, actual)
    }

    @Test
    fun priceGoesDownAllDayTest() {
        val actual = getMaxProfit(intArrayOf(9, 7, 4, 1))
        val expected = -2
//        assertEquals(expected, actual)
    }

    @Test
    fun priceStaysTheSameAllDayTest() {
        val actual = getMaxProfit(intArrayOf(1, 1, 1, 1))
        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun exceptionWithOnePriceTest() {
        assertThrows(Exception::class.java) { getMaxProfit(intArrayOf(5)) }
    }

    @Test
    fun exceptionWithEmptyPricesTest() {
        assertThrows(Exception::class.java) { getMaxProfit(intArrayOf()) }
    }
}
