package leetcode.challenge.august

class NonOverlappingIntervals {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if (intervals.size < 2) return 0

        var erase = 0
        intervals.sortWith(compareBy { it[0] })

        var previous: IntArray? = null

        for (i in intervals.size - 1 downTo 0) {
            val interval = intervals[i]
            if (previous != null && previous[0] < interval[1]) {
                erase++
            } else previous = interval
        }

        return erase
    }
}
