package leetcode.binarysearch

class FindMinElement {

    fun findMin(nums: IntArray): Int {
        var l = 0
        var r = nums.size - 1

        while( r - l > 1) {
            val mid = (r + l) / 2
            when {
                (nums[mid] > nums[l] && nums[mid] < nums[r]) -> r = mid
                (nums[mid] > nums[l]) -> l = mid + 1
                else -> r = mid
            }
        }

        return if(nums[l] < nums[r]) nums[l] else nums[r]
    }
}
