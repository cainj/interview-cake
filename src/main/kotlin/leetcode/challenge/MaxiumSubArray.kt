package leetcode.challenge

import kotlin.math.max

class MaximumSubArray {

    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var currentMax = nums[0]

        for (i in 1 until nums.size) {
            currentMax = max(currentMax + nums[i], nums[i])
            maxSum = max(currentMax, maxSum)
        }
        
        return maxSum
    }
}
