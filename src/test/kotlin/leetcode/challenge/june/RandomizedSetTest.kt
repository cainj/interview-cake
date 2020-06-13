package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RandomizedSetTest {

    @Test
    fun getNums() {
        val randomSet = RandomizedSet()

        assertEquals(true, randomSet.insert(1))
        assertEquals(false, randomSet.remove(2))
        assertEquals(true, randomSet.insert(2))
        assertEquals(false, randomSet.insert(2))
        val ans = randomSet.random
        assertEquals(true, ans == 1 || ans == 2)
        randomSet.remove(1)
        assertEquals(true, randomSet.random == 2)
    }
}
