package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AngleClockTest {

    @Test
    fun angleClock() {
        val ac = AngleClock()
        assertEquals(0.0, ac.angleClock(12, 0))
        assertEquals(165.0, ac.angleClock(12, 30))
        assertEquals(155.0, ac.angleClock(4, 50))
        assertEquals(166.5, ac.angleClock(4, 57))
        assertEquals(133.5, ac.angleClock(6, 57))
    }
}
