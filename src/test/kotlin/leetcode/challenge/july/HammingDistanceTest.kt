package leetcode.challenge.july

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HammingDistanceTest {

    @Test
    fun hammingDistance() {
        val hd = HammingDistance()

        assertEquals(2, hd.hammingDistance(1, 4))
        assertEquals(1, hd.hammingDistance(1, 9))
        assertEquals(4, hd.hammingDistance(17, 705))
        assertEquals(5, hd.hammingDistance(0, 31))
    }
}
