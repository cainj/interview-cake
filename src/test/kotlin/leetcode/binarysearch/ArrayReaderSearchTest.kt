package leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ArrayReaderSearchTest {

    @Test
    fun search() {
        val arraySearch = ArrayReaderSearch(intArrayOf(-1, 0, 3, 5, 9, 12))
        Assertions.assertEquals(0, arraySearch.search(-1))
        Assertions.assertEquals(1, arraySearch.search(0))
        Assertions.assertEquals(2, arraySearch.search(3))
        Assertions.assertEquals(3, arraySearch.search(5))
        Assertions.assertEquals(-1, arraySearch.search(6))
        Assertions.assertEquals(4, arraySearch.search(9))
        Assertions.assertEquals(5, arraySearch.search(12))
    }
}
