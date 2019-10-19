package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MaxStackTest {

    @Test
    fun maxStackTest() {
        val s = MaxStack()
        s.push(5)
        assertEquals(5, s.max(), "check max after 1st push")
        s.push(4)
        s.push(7)
        s.push(7)
        s.push(8)
        assertEquals(8, s.max(), "check before 1st pop")
        assertEquals(8, s.pop(), "check pop #1")
        assertEquals(7, s.max(), "check max after 1st pop")
        assertEquals(7, s.pop(), "check pop #2")
        assertEquals(7, s.max(), "check max after 2nd pop")
        assertEquals(7, s.pop(), "check pop #3")
        assertEquals(5, s.max(), "check max after 3rd pop")
        assertEquals(4, s.pop(), "check pop #4")
        assertEquals(5, s.max(), "check max after 4th pop")
    }
}