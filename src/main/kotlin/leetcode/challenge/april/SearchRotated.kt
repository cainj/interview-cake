package leetcode.challenge.april

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
class SearchRotated {

    fun search(nums: IntArray, target: Int): Int {

        if(nums.isEmpty())
            return -1

        var pivot = 0

        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                pivot = i
                break
            }
        }

        val ans = binarySearch(0, pivot, target, nums)

        return if (ans > -1)
            ans
        else
            binarySearch(pivot + 1, nums.size - 1, target, nums)
    }

    private fun binarySearch(l: Int, r: Int, target: Int, nums: IntArray): Int {
        var left = l
        var right = r

        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }
}
