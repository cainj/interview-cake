package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinaryCodesTest {

    @Test
    fun hasAllCodes() {
        val bc = BinaryCodes()
        assertEquals(true, bc.hasAllCodes("00110110", 2))
        assertEquals(true, bc.hasAllCodes("00110", 2))
        assertEquals(true, bc.hasAllCodes("0110", 1))
        assertEquals(false, bc.hasAllCodes("0000000001011100", 4))
    }
}
