package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EmployeeFreeTimeTest {

    @Test
    fun employeeFreeTime() {
        val employeeFreeTime = EmployeeFreeTime()
        assertEquals(emptyList<EmployeeFreeTime.Interval>(), employeeFreeTime.employeeFreeTime(arrayListOf()))
        assertEquals(
            arrayListOf(EmployeeFreeTime.Interval(3, 4)),
            employeeFreeTime.employeeFreeTime(
                arrayListOf(
                    arrayListOf(
                        EmployeeFreeTime.Interval(1, 2),
                        EmployeeFreeTime.Interval(5, 6)
                    ),
                    arrayListOf(EmployeeFreeTime.Interval(1, 3)),
                    arrayListOf(EmployeeFreeTime.Interval(4, 10))
                )
            )
        )
    }
}
