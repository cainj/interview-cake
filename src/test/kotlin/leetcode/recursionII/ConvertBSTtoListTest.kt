package leetcode.recursionII

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConvertBSTtoListTest {

    @Test
    fun treeToDoublyList() {
        val toList = ConvertBSTtoList()
        assertEquals(null, toList.treeToDoublyList(null))
    }
}
