package leetcode.binarysearch

class SearchRange {

    //apply binary search twice to find the upper then the lower bound.
    fun searchRange(nums: IntArray, target: Int): IntArray {

        var l = 0
        var r = nums.size - 1
        val ans = intArrayOf(-1, -1)

        if (nums.isEmpty())
            return ans

        while (l < r) {
            val mid = l + (r - l) / 2

            if (nums[mid] < target) l = mid + 1
            else r = mid
        }

        if (nums[l] != target) return ans
        else ans[0] = l

        r = nums.size - 1

        while (l < r) {
            val mid = (l + (r - l) / 2) + 1

            if (nums[mid] > target) r = mid - 1
            else l = mid
        }

        if (nums[r] == target) ans[1] = r
        return ans
    }
}
