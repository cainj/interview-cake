package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GetWinnerTest {

    @Test
    fun getWinner() {
        val win = GetWinner()
        assertEquals(5, win.getWinner(intArrayOf(2, 1, 3, 5, 4, 6, 7), 2))
        assertEquals(3, win.getWinner(intArrayOf(3, 2, 1), 10))
        assertEquals(9, win.getWinner(intArrayOf(1, 9, 8, 2, 3, 7, 6, 4, 5), 7))
        assertEquals(99, win.getWinner(intArrayOf(1, 11, 22, 33, 44, 55, 66, 77, 88, 99), 1000000000))
    }
}
