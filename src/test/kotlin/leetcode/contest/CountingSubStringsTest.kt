package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountingSubStringsTest {

    @Test
    fun numSub() {
        val css = CountingSubStrings()
        assertEquals(9, css.numSub("0110111"))
        assertEquals(2, css.numSub("101"))
        assertEquals(21, css.numSub("111111"))
        assertEquals(0, css.numSub("000"))
    }
}
