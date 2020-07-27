package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ConvertTitleTest {

    @Test
    fun convertToTitle() {
        val ct = ConvertTitle()
        assertEquals( "A", ct.convertToTitle(1))
        assertEquals( "AA", ct.convertToTitle(27))
        assertEquals( "ZY", ct.convertToTitle(701))
    }
}
