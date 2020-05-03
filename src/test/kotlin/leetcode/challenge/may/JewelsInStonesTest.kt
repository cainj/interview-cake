package leetcode.challenge.may

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class JewelsInStonesTest {

    @Test
    fun numJewelsInStones() {
        val jewelsInStones = JewelsInStones()
        assertEquals(3, jewelsInStones.numJewelsInStones("aA", "aAAbbbb"))
        assertEquals(7, jewelsInStones.numJewelsInStones("aAb", "aAAbbbb"))
        assertEquals(0, jewelsInStones.numJewelsInStones("z", "ZZ"))
        assertEquals(0, jewelsInStones.numJewelsInStones("", ""))
    }
}