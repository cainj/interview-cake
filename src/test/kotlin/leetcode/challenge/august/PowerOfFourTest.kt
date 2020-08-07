package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PowerOfFourTest {

    @Test
    fun isPowerOfFour() {
        val powerOfFour = PowerOfFour()
        assertEquals(false, powerOfFour.isPowerOfFour(14))
        assertEquals(true, powerOfFour.isPowerOfFour(16))
        assertEquals(true, powerOfFour.isPowerOfFour(4))
        assertEquals(true, powerOfFour.isPowerOfFour(1))
    }
}
