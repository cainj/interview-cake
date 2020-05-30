package leetcode.contest

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CanBeEqualTest {

    @Test
    fun canBeEqual() {
        val e = CanBeEqual()
        assertEquals(true, e.canBeEqual(intArrayOf(1,2,3,4), intArrayOf(2,4,1,3)))
        assertEquals(true, e.canBeEqual(intArrayOf(7), intArrayOf(7)))
        assertEquals(false, e.canBeEqual(intArrayOf(3,7,9), intArrayOf(3,7,11)))
        assertEquals(true, e.canBeEqual(intArrayOf(1,1,1,1,1), intArrayOf(1,1,1,1,1)))
    }
}
