package leetcode.stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RoomKeysTest {

    @Test
    fun canVisitAllRooms() {
        val roomKeys = RoomKeys()
        assertEquals(true, roomKeys.canVisitAllRooms(listOf(listOf(0))))
        assertEquals(true, roomKeys.canVisitAllRooms(listOf(listOf(1), listOf(2), listOf(3), listOf())))
        assertEquals(false, roomKeys.canVisitAllRooms(listOf(listOf(1, 3), listOf(3, 0, 1), listOf(2), listOf(0))))
    }
}
