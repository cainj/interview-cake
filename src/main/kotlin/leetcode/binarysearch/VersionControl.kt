package leetcode.binarysearch

abstract class VersionControl(private val badVersion: Int) {
    abstract fun firstBadVersion(n: Int): Int
    fun isBadVersion(version: Int) = badVersion <= version
}
