package leetcode.queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MeetingRoomsTest {

    @Test
    fun canAttendMeetings() {
        val meetingRoom = MeetingRooms()
        assertEquals(
            false,
            meetingRoom.canAttendMeetings(arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20)))
        )
        assertEquals(
            true,
            meetingRoom.canAttendMeetings(arrayOf(intArrayOf(7, 10), intArrayOf(2, 4), intArrayOf(15, 20)))
        )
    }
}
