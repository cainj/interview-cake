package leetcode.challenge.july

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class CoursesIITest {

    @Test
    fun findOrder() {
        val courses = CoursesII()
        assertArrayEquals(intArrayOf(0, 1), courses.findOrder(2, arrayOf(intArrayOf(1, 0))))
        assertArrayEquals(
            intArrayOf(0, 2, 1, 3),
            courses.findOrder(4, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2)))
        )
    }
}
