package leetcode.challenge

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MaxLengthTest {

    @Test
    fun findMaxLength() {
        val sn = MaxLength()
        assertEquals(sn.findMaxLength(intArrayOf(0,0,1,0,0,0,1,1)), 6)
        assertEquals(sn.findMaxLength(intArrayOf(0,1)), 2)
        assertEquals(68, sn.findMaxLength(intArrayOf(0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1)))
    }
}