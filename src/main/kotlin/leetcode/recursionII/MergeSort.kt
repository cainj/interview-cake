package leetcode.recursionII

class MergeSort {
    fun sortArray(nums: IntArray): IntArray {
        if (nums.size < 2) return nums

        val mid = nums.size / 2
        val left = sortArray(nums.sliceArray(0 until mid))
        val right = sortArray(nums.sliceArray(mid until nums.size))

        return merge(left, right)
    }

    private fun merge(left: IntArray, right: IntArray): IntArray {
        var l = 0
        var r = 0
        var k = 0
        val arr = IntArray(left.size + right.size)

        while (l < left.size && r < right.size)
            if (left[l] < right[r]) arr[k++] = left[l++]
            else arr[k++] = right[r++]

        while (l < left.size) arr[k++] = left[l++]
        while (r < right.size) arr[k++] = right[r++]

        return arr
    }
}
