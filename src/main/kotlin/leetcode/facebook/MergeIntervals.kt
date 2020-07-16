package leetcode.facebook

class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isNotEmpty() && intervals[0].isEmpty()) return emptyArray()

        intervals.sortWith(compareBy({ it[0] }, { it[1] }))
        val results = mutableListOf<IntArray>()

        var i = 0
        while (i < intervals.size) {

            var j = i
            var curr = intervals[j][1]

            while (j < intervals.size - 1) {
                if (curr < intervals[j + 1][0]) break
                else if (curr < intervals[j + 1][1]) curr = intervals[j + 1][1]
                j++
            }

            results.add(intArrayOf(intervals[i][0], curr))
            i = j + 1
        }
        return results.toTypedArray()
    }
}
