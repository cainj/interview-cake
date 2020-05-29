package leetcode.binarysearch

class IntersectionTwoArrayII {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()
        return merge(nums1, nums2, 0, 0, mutableListOf()).toIntArray()
    }

    private fun merge(
        left: IntArray,
        right: IntArray,
        l: Int,
        r: Int,
        intersection: MutableList<Int>
    ): MutableList<Int> {
        if (l == left.size || r == right.size) return intersection
        else if (left[l] == right[r]) {
            intersection.add(left[l])
            merge(left, right, l + 1, r + 1, intersection)
        } else if (left[l] < right[r]) merge(left, right, l + 1, r, intersection)
        else merge(left, right, l, r + 1, intersection)

        return intersection
    }
}
