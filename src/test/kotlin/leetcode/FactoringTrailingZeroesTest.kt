package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FactoringTrailingZeroesTest {

    @Test
    fun trailingZeroes() {
        val tz = FactoringTrailingZeroes()
        assertEquals(0, tz.trailingZeroes(3))
        assertEquals(1, tz.trailingZeroes(6))
        assertEquals(12, tz.trailingZeroes(50))
    }
}
