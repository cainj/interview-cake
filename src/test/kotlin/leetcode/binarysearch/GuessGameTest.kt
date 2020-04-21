package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GuessGameTest {

    @Test
    fun guessNumber() {
        val guessGame = GuessGame(40)
        assertEquals(40, guessGame.guessNumber(90))
        assertEquals(40, guessGame.guessNumber(40))
        assertEquals(40, guessGame.guessNumber(500))
    }
}
