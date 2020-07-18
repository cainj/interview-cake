package leetcode.queues

import java.util.*
import kotlin.Comparator
import kotlin.math.max
import kotlin.math.min

class MeetingRooms {

    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        val queue = PriorityQueue<IntArray>(Comparator { a, b ->
            when {
                a[0] > b[0] -> 1
                a[0] == b[0] -> 0
                else -> -1
            }
        })

        var anchor = Int.MAX_VALUE
        for (i in intervals) {
            queue.add(i)
            anchor = min(anchor, i[0])
        }

        while (queue.isNotEmpty()) {
            val interval = queue.poll()
            if (anchor > interval[0]) return false
            anchor = max(anchor, interval[1])
        }

        return true
    }
}
