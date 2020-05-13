package leetcode.recursion

class FibonacciMemo {

    private val cache = hashMapOf<Int, Int>(0 to 0, 1 to 1)

    fun fib(N: Int): Int {
        if (cache.contains(N)) return cache[N]!!
        cache[N] = fib(N - 1) + fib(N - 2)
        return cache[N]!!
    }
}
