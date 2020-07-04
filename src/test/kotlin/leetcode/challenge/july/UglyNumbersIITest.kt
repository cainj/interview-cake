package leetcode.challenge.july

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class UglyNumbersIITest {

    @Test
    fun nthUglyNumber() {
        val uglyNumbers = UglyNumbersII()
        assertEquals(12, uglyNumbers.nthUglyNumber(10))
        assertEquals(1, uglyNumbers.nthUglyNumber(1))
        assertEquals(2, uglyNumbers.nthUglyNumber(2))
        assertEquals(3, uglyNumbers.nthUglyNumber(3))
        assertEquals(30375, uglyNumbers.nthUglyNumber(234))
    }
}
