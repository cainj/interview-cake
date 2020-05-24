package leetcode.strings

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class ReverseStringTest {

    @Test
    fun reverseString() {
        val reverse = ReverseString()
        val actual = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverse.reverseString(actual)

        assertArrayEquals(
            charArrayOf('o', 'l', 'l', 'e', 'h'),
            actual
        )
    }
}
