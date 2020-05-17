package leetcode.contest

class BusyStudent {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        val times = startTime.size - 1
        var count = 0
        for (i in 0..times)
            if (startTime[i] <= queryTime && queryTime <= endTime[i])
                count++

        return count
    }
}
