package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BusyStudentTest {

    @Test
    fun busyStudent() {
        val bs = BusyStudent()
        assertEquals(1, bs.busyStudent(intArrayOf(4), intArrayOf(4), 4))
        assertEquals(0, bs.busyStudent(intArrayOf(4), intArrayOf(4), 5))
        assertEquals(0, bs.busyStudent(intArrayOf(1,1,1,1), intArrayOf(1,3,2,4), 7))
        assertEquals(5, bs.busyStudent(intArrayOf(9,8,7,6,5,4,3,2,1), intArrayOf(10,10,10,10,10,10,10,10,10), 5))
    }
}
