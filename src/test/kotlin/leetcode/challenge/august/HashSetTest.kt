package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HashSetTest {

    @Test
    fun test() {
        val hs = HashSet()
        hs.add(3)
        assertEquals(true, hs.contains(3))
        hs.remove(3)
        assertEquals(false, hs.contains(3))
    }
}
