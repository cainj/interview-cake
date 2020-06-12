package leetcode.challenge.june

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var end = nums1.size - 1
        var k = m - 1
        var l = n - 1

        while (k >= 0 && l >= 0)
            if (nums2[l] >= nums1[k]) nums1[end--] = nums2[l--]
            else nums1[end--] = nums1[k--]


        while (l >= 0)
            nums1[end--] = nums2[l--]
    }
}
