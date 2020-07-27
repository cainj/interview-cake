package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddDigitsTest {

    @Test
    fun addDigits() {
        val addDigits = AddDigits()
        assertEquals(2, addDigits.addDigits(38))
        assertEquals(9, addDigits.addDigits(99))
        assertEquals(2, addDigits.addDigits(101))
    }
}
