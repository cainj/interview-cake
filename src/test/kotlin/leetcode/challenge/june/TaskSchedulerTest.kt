package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TaskSchedulerTest {

    @Test
    fun leastInterval() {
        val li = TaskScheduler()
        assertEquals(8, li.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2))
        assertEquals(6, li.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 0))
    }
}
