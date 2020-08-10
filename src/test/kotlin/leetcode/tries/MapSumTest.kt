package leetcode.tries

import leetcode.tries.MapSum
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MapSumTest {

    @Test
    fun test() {
        val mapSum = MapSum()
        mapSum.insert("aa", 2)
        assertEquals(2, mapSum.sum("a"))
        mapSum.insert("aa", 3)
        assertEquals(3, mapSum.sum("a"))
        mapSum.insert("apples", 3)
        assertEquals(3, mapSum.sum("app"))
    }
}
