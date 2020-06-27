package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PhoneNumberTest {

    @Test
    fun letterCombinations() {
        val phoneNumber = PhoneNumber()
        assertEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            phoneNumber.letterCombinations("23")
        )
        assertEquals(
            listOf("a", "b", "c"),
            phoneNumber.letterCombinations("2")
        )
        assertEquals(
            listOf(
                "gw", "gx", "gy", "gz", "hw", "hx", "hy", "hz", "iw", "ix", "iy", "iz"
            ),
            phoneNumber.letterCombinations("49")
        )
    }
}
