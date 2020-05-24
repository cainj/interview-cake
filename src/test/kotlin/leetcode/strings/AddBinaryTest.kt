package leetcode.strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddBinaryTest {

    @Test
    fun addBinary() {
        val binary = AddBinary()
        assertEquals("100", binary.addBinary("11", "1"))
        assertEquals("10101", binary.addBinary("1010", "1011"))
    }
}
