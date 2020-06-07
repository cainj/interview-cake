package leetcode.binarysearch

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 *
 * Find the minimum element.
 *
 * You may assume no duplicate exists in the array.
 *
 * Example 1:
 *
 * Input: [3,4,5,1,2]
 * Output: 1
 *
 * Example 2:
 * Input: [4,5,6,7,0,1,2]
 * Output: 0
 *
 * Construct an algorithm that does this in O(logn) runtime and 0(1) complexity
 */
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
