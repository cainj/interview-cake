package leetcode.binarysearch

class IntersectionTwoArrays {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        val intersection = mutableListOf<Int>()

        for (target in nums2) {
            var l = 0
            var r = nums1.size - 1

            if (!intersection.contains(target))
                loop@ while (l <= r) {
                    val mid = l + (r - l) / 2
                    when {
                        nums1[mid] == target -> {
                            intersection.add(target)
                            break@loop
                        }
                        nums1[mid] > target -> r = mid - 1
                        else -> l = mid + 1
                    }
                }
        }

        return intersection.toIntArray()
    }
}
