package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PowerOfTwoTest {

    @Test
    fun isPowerOfTwo() {
        val p = PowerOfTwo()
        assertEquals(true, p.isPowerOfTwo(16))
        assertEquals(true, p.isPowerOfTwo(4))
        assertEquals(true, p.isPowerOfTwo(32))
        assertEquals(false, p.isPowerOfTwo(10))
        assertEquals(false, p.isPowerOfTwo(100930393))
        assertEquals(false, p.isPowerOfTwo(0))
    }
}
