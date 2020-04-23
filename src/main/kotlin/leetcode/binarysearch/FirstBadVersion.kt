package leetcode.binarysearch

class FirstBadVersion(version: Int) : VersionControl(version) {

    override fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n
        var mid = 0
        while (left < right) {
            mid = left + (right - left) / 2
            if (isBadVersion(mid))
                right = mid
            else left = mid + 1
        }
        return left
    }
}
