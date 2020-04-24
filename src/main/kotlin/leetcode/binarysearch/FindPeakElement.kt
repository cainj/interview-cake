package leetcode.binarysearch

class FindPeakElement {
    fun findPeakElement(nums: IntArray): Int {


        if (nums.size == 1) return 0

        var left = 0
        var right = nums.size - 1

        while (right > left) {
            val mid = (left + right) / 2
            if (nums[mid] < nums[mid + 1]) left = mid + 1
            else right = mid

        }

        return left

    }
}

/*
    [1,2,3,1]
    iter: 0, left = 0, right = 3, mid = 1
    nums[mid] = 2, nums[mid + 1] = 3, => left = 2, right 3, mid = 1
    break
    return 2

    [1,2,1,3,5,6,4]
    iter: 0, left = 0, right = 6, mid = 3
    nums[mid] = 3, nums[mid + 1] = 5, => left = 4, right 6
    iter: 1, left = 4, right = 6, mid = 5
    nums[mid] = 6, nums[mid + 1] = 4, => left = 4, right 5
    iter: 2, left = 4, right = 5, mid = 4
    nums[mid] =5, nums[mid + 1] = 6, => left = 5, right 5
    break
    return 5

*/
