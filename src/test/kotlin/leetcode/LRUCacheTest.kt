package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LRUCacheTest {

    @Test
    fun lruCache() {

        val lru = LRUCache(2)
        assertEquals(-1, lru.get(1))
        assertEquals(-1, lru.get(2))
        lru.put(2, 2)
        lru.put(1, 2)
        lru.put(1, 1)
        assertEquals(1, lru.get(1))
        assertEquals(2, lru.get(2))
        assertEquals(-1, lru.get(3))
        lru.put(3, 3)
        assertEquals(3, lru.get(3))
        assertEquals(-1, lru.get(1))
        assertEquals(2, lru.get(2))
        lru.put(4, 4)
        assertEquals(-1, lru.get(3))
        assertEquals(4, lru.get(4))
        lru.put(5, 5)
        assertEquals(4, lru.get(4))
        assertEquals(5, lru.get(5))

    }

    @Test
    fun leetcodeTest() {
        /**
         * ["LRUCache","put","get","put","get","get"]
        [[1],[2,1],[2],[3,2],[2],[3]]
         */
        val lru = LRUCache(1)
        lru.put(2, 1)
        assertEquals(1, lru.get(2))
        lru.put(3, 2)
        assertEquals(-1, lru.get(2))
    }
}
