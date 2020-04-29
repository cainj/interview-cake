package leetcode.recursion

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class ReverseStringTest {

    @Test
    fun reverseString() {
        val rs = ReverseString()
        assertArrayEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), rs.reverseString(charArrayOf('h', 'e', 'l', 'l', 'o')))
        assertArrayEquals(charArrayOf('l', 'l', 'e', 'h'), rs.reverseString(charArrayOf('h', 'e', 'l', 'l')))
        assertArrayEquals(charArrayOf(), rs.reverseString(charArrayOf()))
    }
}
