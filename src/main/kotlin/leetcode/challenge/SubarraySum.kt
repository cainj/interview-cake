package leetcode.challenge

class SubarraySum {

    //O(n) on Runtime
    //O(n) on Space Complexity
    fun subarraySum(nums: IntArray, k: Int): Int {
        val cumulativeSum = hashMapOf<Int, Int>()
        var sum = 0
        cumulativeSum[0] = 1
        var count = 0

        for (n in nums) {
            sum += n
            if (cumulativeSum.contains(sum - k))
                count += cumulativeSum[sum - k]!!
            cumulativeSum[sum] = cumulativeSum.getOrDefault(sum, 0) + 1
        }

        return count
    }

    // Runtime O(n^2)
    // O(1) on Space complexity
//    fun subarraySum(nums: IntArray, k: Int): Int {
//        var count = 0
//        var sum = nums[0]
//
//        for (i in nums.indices) {
//            sum = nums[i]
//            for (j in i until nums.size) {
//                if (i != j) sum += nums[j]
//                if (sum == k) count++
//            }
//        }
//
//        return count
//    }
}
