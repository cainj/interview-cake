package leetcode.challenge.june

class TwoCitySchedule {

    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        var ans = 0
        val sorted = costs.sortedBy { it[0] - it[1] }

        for (i in sorted.indices)
            ans +=
                if (i < sorted.size / 2) sorted[i][0]
                else sorted[i][1]

        return ans
    }
}
