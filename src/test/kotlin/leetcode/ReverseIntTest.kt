package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReverseIntTest {

    @Test
    fun reverse() {
        val r = ReverseInt()
        assertEquals(321, r.reverse(123))
        assertEquals(-321, r.reverse(-123))
        assertEquals(21, r.reverse(120))
    }
}
