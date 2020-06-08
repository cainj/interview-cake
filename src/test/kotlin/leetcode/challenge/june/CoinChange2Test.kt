package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CoinChange2Test {

    @Test
    fun change() {
        val coinChange = CoinChange2()
        assertEquals(4, coinChange.change(5, intArrayOf(1, 2, 5)))
        assertEquals(0, coinChange.change(3, intArrayOf(2)))
        assertEquals(1, coinChange.change(20, intArrayOf(20)))
        assertEquals(1, coinChange.change(0, intArrayOf(0)))
        assertEquals(1, coinChange.change(0, intArrayOf()))
    }
}
