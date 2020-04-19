package leetcode.binarysearch

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    var mid = left

    // check the mid against the target
    // while left < right
    // if nums[mid] == target then return
    // else if nums[mid] < target search right -> left = mid + 1, mid = (left + right) / 2,
    // else search left -> right = mid - 1, mid = (left + right) / 2,
    // throw exception if target is not found

    while (left <= right) {
        mid = left + (right - left) / 2
        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}