package leetcode.binarysearch

class FindPositiveInteger {

    fun findSolution(customfunction: CustomFunction, z: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        for (x in 1..z) {
            var lo = 1
            var hi = 1000
            while (lo < hi) {
                val mid = lo + (hi - lo) / 2
                val answer = customfunction.f(x, mid)
                if (z == answer) {
                    ans.add(listOf(x, mid))
                    break
                } else if (answer > z) hi = mid
                else lo = mid + 1
            }
        }

        return ans
    }

    class CustomFunction(private val func: Int) {
        fun f(x: Int, y: Int) =
            when (func) {
                1 -> x + y
                2 -> x * y
                else -> throw UnsupportedOperationException("Function not supported")
            }
    }
}

