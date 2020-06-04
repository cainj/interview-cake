package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwoCityScheduleTest {

    @Test
    fun twoCitySchedCost() {
        val tc = TwoCitySchedule()
        assertEquals(
            110, tc.twoCitySchedCost(
                arrayOf(
                    intArrayOf(10, 20),
                    intArrayOf(30, 200),
                    intArrayOf(400, 50),
                    intArrayOf(30, 20)
                )
            )
        )

        assertEquals(
            293, tc.twoCitySchedCost(
                arrayOf(
                    intArrayOf(10, 201),
                    intArrayOf(30, 200),
                    intArrayOf(400, 53),
                    intArrayOf(30, 290)
                )
            )
        )
    }
}
