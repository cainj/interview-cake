package leetcode

import kotlin.math.min

class MinimumSumSubArray {

    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        var min: Int? = null
        var sum = 0
        var left = 0

        for (i in nums.indices) {
            sum += nums[i]

            while (sum >= s) {
                min = min(i + 1 - left, min ?: i + 1 - left)
                sum -= nums[left]
                left++
            }
        }

        return min ?: 0
    }
}
