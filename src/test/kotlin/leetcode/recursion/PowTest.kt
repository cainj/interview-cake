package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PowTest {

    @Test
    fun myPow() {
        val p = Pow()
        assertEquals(59049.0, p.myPow(3.0, 10))
        assertEquals(0.25, p.myPow(2.0, -2))
        assertEquals(9.261000000000001, p.myPow(2.1, 3))
    }
}
