package leetcode.queues

import java.util.*
import kotlin.Comparator

class MeetingRoomsII {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        val max = intervals.size

        val meetingRooms = PriorityQueue<Int>(Comparator { a, b ->
            a - b
        })

        intervals.sortBy { it[0] }

        for (i in intervals.indices) {
            if (meetingRooms.peek() != null) {
                if (intervals[i][0] >= meetingRooms.peek()) meetingRooms.poll()
                meetingRooms.add(intervals[i][1])
            } else meetingRooms.add(intervals[0][1])

        }

        return meetingRooms.size
    }
}
