package leetcode.challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MoveZeroesTest {

    private val test = MoveZeroes()

    @Test
    fun moveZeroes() {
        Assertions.assertArrayEquals(test.moveZeroes(intArrayOf(1,2)), intArrayOf(1, 2))
        Assertions.assertArrayEquals(test.moveZeroes(intArrayOf(1)), intArrayOf(1))
        Assertions.assertArrayEquals(test.moveZeroes(intArrayOf(0,1,0,3,12)), intArrayOf(1,3,12,0,0))
        Assertions.assertArrayEquals(test.moveZeroes(intArrayOf(0)), intArrayOf(0))
    }
}
