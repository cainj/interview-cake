package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MovingDataStreamTest {

    @Test
    operator fun next() {

        val m = MovingDataStream(3)

        assertEquals(3, m.size)
        assertEquals(1.0, m.next(1))
        assertEquals(5.5, m.next(10))
        assertEquals(4.666666666666667, m.next(3))
        assertEquals(6.0, m.next(5))
    }
}
