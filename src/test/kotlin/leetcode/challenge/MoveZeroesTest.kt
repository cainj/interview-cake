package leetcode.challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MoveZeroesTest {

    private val test = MoveZeroes()

    @Test
    fun moveZeroes() {
        Assertions.assertEquals(test.moveZeroes(intArrayOf(1,2)).toList(), intArrayOf(1, 2).toList())
        Assertions.assertEquals(test.moveZeroes(intArrayOf(1)).toList(), intArrayOf(1).toList())
        Assertions.assertEquals(test.moveZeroes(intArrayOf(0,1,0,3,12)).toList(), intArrayOf(1,3,12,0,0).toList())
        Assertions.assertEquals(test.moveZeroes(intArrayOf(0)).toList(), intArrayOf(0).toList())
    }
}
