package leetcode.binarysearch

class PeakIndex {

    fun peakIndexInMountainArray(A: IntArray): Int {
        var l = 0
        var r = A.size

        while (l < r) {
            val mid = l + (r - l) / 2
            if (A[mid] < A[mid + 1]) l = mid + 1
            else r = mid
        }

        return l
    }
}
