package leetcode.challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StringShiftsTest {

    private val ss = StringShifts()

    @Test
    fun stringShift() {
        assertEquals(
            "efgabcd",
            ss.stringShift("abcdefg", arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(0, 2), intArrayOf(1, 3)))
        )

        assertEquals("cab", ss.stringShift("abc", arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))))
    }
}