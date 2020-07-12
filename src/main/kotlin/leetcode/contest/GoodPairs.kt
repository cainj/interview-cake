package leetcode.contest

class GoodPairs {

    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices)
            for (j in nums.indices)
                if (nums[i] == nums[j] && i < j)
                    count++

        return count
    }
}
