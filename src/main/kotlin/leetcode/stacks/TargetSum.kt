package leetcode.stacks

class TargetSum {

    var count = 0

    fun findTargetSumWays(nums: IntArray, S: Int): Int {
        calculate(0, nums, 0, S)
        return count
    }

    private fun calculate(index: Int, nums: IntArray, sum: Int, target: Int) {
        if (index == nums.size) {
            if (sum == target) count++
            return
        }

        val neighbors = arrayListOf(nums[index], -1 * nums[index])
        for (n in neighbors)
            calculate(index + 1, nums, n + sum, target)
    }
}
