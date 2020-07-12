package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReverseBitsTest {

    @Test
    fun reverseBits() {
        val reverse = ReverseBits()
        assertEquals(38274066, reverse.reverseBits(1210061376))
        assertEquals(-2, reverse.reverseBits(Int.MAX_VALUE))
        assertEquals(Int.MIN_VALUE, reverse.reverseBits(1))
    }
}
