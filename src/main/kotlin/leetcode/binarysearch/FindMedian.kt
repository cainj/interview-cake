package leetcode.binarysearch

import kotlin.math.max
import kotlin.math.min

class FindMedian {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        if (nums1.size > nums2.size) return findMedianSortedArrays(nums2, nums1)

        val x = nums1.size
        val y = nums2.size

        var l = 0
        var r = x

        while (l <= r) {
            val i = (l + r) / 2
            val j = ((x + y + 1) / 2) - i

            if (i < r && nums2[j - 1] > nums1[i]) l = i + 1
            else if (i > l && nums1[i - 1] > nums2[j]) r = i - 1
            else {
                val maxLeft = when {
                    i == 0 -> nums2[j - 1]
                    j == 0 -> nums1[i - 1]
                    else -> max(nums1[i - 1], nums2[j - 1])
                }

                if ((x + y) % 2 == 1) return maxLeft.toDouble()

                val minRight = when {
                    i == x -> nums2[j]
                    j == y -> nums1[i]
                    else -> min(nums2[j], nums1[i])
                }

                return (maxLeft + minRight).toDouble() / 2.0
            }
        }

        return -1.0
    }
}
