package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CheckStraighLineTest {

    @Test
    fun simpleTwoSumTest() {
        val expected = intArrayOf(0, 1)
        val actual = checkStraightLine(
            arrayOf(
                intArrayOf(-3,-2),
                intArrayOf(-1,-2),
                intArrayOf(2,-2),
                intArrayOf(-2,-2),
                intArrayOf(0,-2)
            )
        )

        Assertions.assertEquals(true, actual)
    }
}