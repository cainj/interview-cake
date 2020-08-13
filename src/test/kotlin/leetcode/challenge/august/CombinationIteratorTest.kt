package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CombinationIteratorTest {

    @Test
    fun test() {
        var ci = CombinationIterator("abc", 2)
        assertEquals(true, ci.hasNext())
        assertEquals("ab", ci.next())
        assertEquals(true, ci.hasNext())
        assertEquals("ac", ci.next())
        assertEquals("bc", ci.next())
        assertEquals(false, ci.hasNext())

        ci = CombinationIterator("", 3)
        assertEquals(false, ci.hasNext())
    }
}
