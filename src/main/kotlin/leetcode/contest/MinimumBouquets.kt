package leetcode.contest

class MinimumBouquets {

    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        if (m * k > bloomDay.size) return -1

        var l = 0
        var r = (1e9).toInt()
        var ans = -1

        while (l <= r) {
            val mid = l + (r - l) / 2
            if (check(bloomDay, m, k, mid)) {
                ans = mid
                r = mid - 1
            } else l = mid + 1
        }

        return ans
    }

    private fun check(days: IntArray, m: Int, k: Int, mid: Int): Boolean {

        var total = 0
        var c = 0

        for (i in days.indices)
            if (days[i] <= mid) {
                if (++c == k) {
                    total++
                    c = 0
                }
            } else c = 0
        return total >= m
    }
}

