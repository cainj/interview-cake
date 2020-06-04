package leetcode.challenge.april

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RangeBitwiseAndTest {

    @Test
    fun rangeBitwiseAnd() {
        val rba = RangeBitwiseAnd()
        assertEquals(4, rba.rangeBitwiseAnd(5, 7))
        assertEquals(0, rba.rangeBitwiseAnd(0, 1))
        assertEquals(8, rba.rangeBitwiseAnd(10, 12))
        assertEquals(2147483520, rba.rangeBitwiseAnd(Int.MAX_VALUE - 100, Int.MAX_VALUE))
    }
}
