package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CharFrequencyTest {

    @Test
    fun frequencySort() {
        val fs = CharFrequency()
        assertEquals("eert", fs.frequencySort("tree"))
        assertEquals("aaaccc", fs.frequencySort("cccaaa"))
        assertEquals("bbAa", fs.frequencySort("Aabb"))
    }
}
