package leetcode.challenge.august

class FindDuplicates {

    fun findDuplicates(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()

        for (i in nums.indices) {
            val index = Math.abs(nums[i])
            if (nums[index - 1] < 1) result.add(index)
            else nums[index - 1] *= -1
        }

        return result
    }
}
