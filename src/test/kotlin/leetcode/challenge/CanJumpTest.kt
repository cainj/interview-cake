package leetcode.challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CanJumpTest {

    @Test
    fun canJump() {
        val cj = CanJump()
        assertEquals(false, cj.canJump(intArrayOf(2, 3, 1, 0, 0, 2, 0, 4)))
        assertEquals(true, cj.canJump(intArrayOf(2, 3, 1, 1, 4)))
        assertEquals(true, cj.canJump(intArrayOf(0)))
        assertEquals(true, cj.canJump(intArrayOf(2, 0, 2, 0, 4)))
        assertEquals(false, cj.canJump(intArrayOf(3,2,1,0,4)))
    }
}