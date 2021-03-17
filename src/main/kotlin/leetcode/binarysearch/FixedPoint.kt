package leetcode.binarysearch

class FixedPoint {
    fun fixedPoint(arr: IntArray): Int {

        var ans = -1
        var l = 0
        var r = arr.size

        while (l < r) {
            val mid = l + (r - l) / 2
            if (arr[mid] < mid) l = mid + 1
            else {
                if (mid == arr[mid]) ans = mid
                r = mid
            }
        }

        return ans
    }
}
