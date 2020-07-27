package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RomanNumeralsTest {

    @Test
    fun romanToInt() {
        val romanNumerals = RomanNumerals()
        assertEquals(3, romanNumerals.romanToInt("III"))
        assertEquals(4, romanNumerals.romanToInt("IV"))
        assertEquals(9, romanNumerals.romanToInt("IX"))
        assertEquals(58, romanNumerals.romanToInt("LVIII"))
        assertEquals(1994, romanNumerals.romanToInt("MCMXCIV"))
    }
}
