package leetcode.challenge.july

class `3Sum` {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val ans = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 1)
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                var lo = i + 1
                var high = nums.size - 1
                val sum = 0 - nums[i]

                while (lo < high) {
                    when {
                        nums[high] + nums[lo] == sum -> {
                            ans.add(listOf(nums[i], nums[lo], nums[high]))
                            while (lo < high && nums[lo] == nums[lo + 1]) lo++
                            while (lo < high && nums[high] == nums[high - 1]) high--
                            lo++
                            high--
                        }
                        nums[high] + nums[lo] > sum -> high--
                        else -> lo++
                    }
                }
            }

        return ans
    }
}
