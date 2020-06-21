package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class XOROperationTest {

    @Test
    fun xorOperation() {
        val xor = XOROperation()
        assertEquals(8, xor.xorOperation(5, 0))
        assertEquals(8, xor.xorOperation(4, 3))
        assertEquals(7, xor.xorOperation(1, 7))
        assertEquals(2, xor.xorOperation(10, 5))
    }
}
