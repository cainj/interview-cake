package leetcode

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sums = HashMap<Int, Int>()

        for (index in nums.indices)
            if (sums.containsKey(nums[index]))
                return intArrayOf(sums[nums[index]]!!, index)
            else
                sums[target - nums[index]] = index
        return IntArray(0)
    }
}
