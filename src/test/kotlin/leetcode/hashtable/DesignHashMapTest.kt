package leetcode.hashtable

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DesignHashMapTest {

    @Test
    fun test() {
        val hash = DesignHashMap()
        hash.put(1, 1)
        assertEquals(1, hash.get(1))
        hash.put(1, 100)
        assertEquals(100, hash.get(1))
        assertEquals(-1, hash.get(2))
        hash.remove(1)
        assertEquals(-1, hash.get(1))
    }
}
