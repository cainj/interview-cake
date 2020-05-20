package leetcode.strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountAndSayTest {

    @Test
    fun countAndSay() {
        val cs = CountAndSay()
        assertEquals("1", cs.countAndSay(1))
        assertEquals("11", cs.countAndSay(2))
        assertEquals("21", cs.countAndSay(3))
        assertEquals("13211311123113112211", cs.countAndSay(10))
    }
}
