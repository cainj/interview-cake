package leetcode.queues

import java.util.*
import kotlin.math.*


class EmployeeFreeTime {
    data class Interval(var start: Int, var end: Int)

    fun employeeFreeTime(avails: ArrayList<ArrayList<Interval>>): ArrayList<Interval> {
        val ans = ArrayList<Interval>()
        val pq = PriorityQueue(Comparator { a: Job, b: Job ->
            avails[a.eid][a.index].start -
                    avails[b.eid][b.index].start
        })
        var anchor = Int.MAX_VALUE

        for ((ei, employee) in avails.withIndex()) {
            pq.offer(Job(ei, 0))
            anchor = min(anchor, employee[0].start)
        }

        while (!pq.isEmpty()) {
            val job = pq.poll()
            val iv: Interval = avails[job.eid][job.index]
            if (anchor < iv.start) ans.add(Interval(anchor, iv.start))
            anchor = max(anchor, iv.end)
            if (++job.index < avails[job.eid].size) pq.offer(job)
        }
        return ans
    }

    data class Job(var eid: Int, var index: Int)
}
