package leetcode.binarysearch

class NegativeNumberSorted {

    fun countNegatives(grid: Array<IntArray>): Int {
        var ans = 0
        for (row in grid)
            ans += binarySearch(row)

        return ans
    }

    private fun binarySearch(row: IntArray): Int {

        var l = 0
        var r = row.size

        while (l < r) {
            val mid = l + (r - l) / 2
            if (row[mid] > -1) l = mid + 1
            else r = mid
        }

        return if (l >= row.size || row[l] > -1) return 0 else row.size - l
    }
}
