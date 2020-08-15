package leetcode.binarysearch

class CapacityShipPackages {
    fun shipWithinDays(weights: IntArray, D: Int): Int {
        //if( D == 1) return weights.sum()

        fun shipable(capacity: Int): Boolean {
            var days = 1
            var total = 0

            for (weight in weights) {
                total += weight
                if (total > capacity) {
                    total = weight
                    days++
                    if (days > D) return false
                }
            }

            return true
        }

        var l = weights.max() ?: 0
        var r = Int.MAX_VALUE

        while (l < r) {
            val mid = l + (r - l) / 2

            if (shipable(mid)) r = mid
            else l = mid + 1

        }

        return l

    }

}
