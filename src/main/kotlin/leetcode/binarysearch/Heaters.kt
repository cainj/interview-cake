package leetcode.binarysearch

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Heaters {

    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        var max = 0
        heaters.sort()
        for (house in houses)
            max = max(max, binarySearch(house, heaters))
        return max
    }

    private fun binarySearch(house: Int, heaters: IntArray): Int {
        if (heaters.isEmpty()) return Int.MAX_VALUE

        var l = 0
        var r = heaters.size

        while (l < r) {
            val mid = l + (r - l) / 2
            when {
                heaters[mid] == house -> return 0
                heaters[mid] < house -> l = mid + 1
                else -> r = mid
            }
        }

        return when (r) {
            heaters.size -> abs(heaters[r - 1] - house)
            0 -> abs(heaters[r] - house)
            else -> min(abs(heaters[r - 1] - house), abs(heaters[r] - house))
        }
    }
}
