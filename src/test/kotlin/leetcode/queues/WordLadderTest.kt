package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordLadderTest {

    @Test
    fun ladderLength() {
        val ladder = WordLadder()
        assertEquals(
            5,
            ladder.ladderLength(
                "hit", "cog",
                arrayListOf("hot", "dot", "dog", "lot", "log", "cog")
            )
        )
        assertEquals(
            0,
            ladder.ladderLength(
                "hit", "cog",
                arrayListOf("hot", "dot", "dog", "lot", "log")
            )
        )
        assertEquals(
            4,
            ladder.ladderLength(
                "home", "code",
                arrayListOf("hone", "dome", "cone", "none", "lone", "code")
            )
        )
    }
}
