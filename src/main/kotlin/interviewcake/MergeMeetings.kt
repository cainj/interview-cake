package interviewcake

class Meeting(val startTime: Long, val endTime: Long) {
    override fun toString(): String {
        return "($startTime, $endTime)"
    }

    fun merge(otherMeeting: Meeting): Meeting {
        val endTime =
            if (otherMeeting.endTime > endTime) {
                otherMeeting.endTime
            } else
                endTime
        return Meeting(startTime, endTime)
    }

    override fun equals(other: Any?): Boolean {
        return (other is Meeting) && startTime == other.startTime && endTime == endTime
    }

    override fun hashCode(): Int {
        var result = startTime.hashCode()
        result = 31 * result + endTime.hashCode()
        return result
    }

    companion object {
        fun empty(): Meeting = Meeting(0, 0)
    }
}// number of 30 min blocks past 9:00 am

fun mergeRanges(meetings: Array<Meeting>): ArrayList<Meeting> {
    meetings.sortBy { it.startTime }
    val mergedList = ArrayList<Meeting>()
    println(meetings.toList())
    var hold = meetings[0]
    for (i in 1 until meetings.size) {
        hold =
            if (hold.endTime >= meetings[i].startTime)
                hold.merge(meetings[i])
            else {
                mergedList.add(hold)
                meetings[i]
            }
    }
    mergedList.add(hold)
    return mergedList
}

fun main() {
    val meetings = arrayOf(Meeting(1, 9), Meeting(2, 6), Meeting(3, 5), Meeting(7, 10))
    val mergedMeetings = mergeRanges(meetings)
    println(mergedMeetings)
    assert(arrayOf(Meeting(1, 10)).contentEquals(mergedMeetings.toArray()))
}
