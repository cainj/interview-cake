package leetcode.recursion

class ClimbingStairs {

    private var cache = hashMapOf<Int, Int>(0 to 1, 1 to 1, 2 to 2)

    fun climb(n: Int): Int {
        if (cache.contains(n)) return cache[n]!!
        cache[n] = climb(n - 1) + climb(n - 2)
        return cache[n]!!
    }
}
