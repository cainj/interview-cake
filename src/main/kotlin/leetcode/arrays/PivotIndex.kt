package leetcode.arrays

class PivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var left = 0

        for (i in nums.indices) {
            if (sum - left - nums[i] == left) return i
            left += nums[i]
        }

        return -1
    }
}
