package leetcode.binarysearch

class FindMinElementII {

    fun findMin(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val mid = l + (r - l) / 2
            when {
                (nums[mid] < nums[r]) -> r = mid
                (nums[mid] > nums[r]) -> l = mid + 1
                else -> r--
            }
        }

        return nums[l]
    }
}
