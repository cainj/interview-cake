package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MeetingRoomsIITest {

    @Test
    fun minMeetingRooms() {
        val mmr = MeetingRoomsII()
        assertEquals(2, mmr.minMeetingRooms(arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))))
        assertEquals(1, mmr.minMeetingRooms(arrayOf(intArrayOf(7, 10), intArrayOf(2, 4))))
        assertEquals(0, mmr.minMeetingRooms(arrayOf()))
    }
}
