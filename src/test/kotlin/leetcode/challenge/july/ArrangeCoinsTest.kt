package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ArrangeCoinsTest {

    @Test
    fun arrangeCoins() {
        val arrangeCoins = ArrangeCoins()
        assertEquals(3, arrangeCoins.arrangeCoins(8))
        assertEquals(5, arrangeCoins.arrangeCoins(18))
        assertEquals(7, arrangeCoins.arrangeCoins(29))
    }
}
