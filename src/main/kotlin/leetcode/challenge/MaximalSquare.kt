package leetcode.challenge

import kotlin.math.max
import kotlin.math.min

class MaximalSquare {

    fun maximalSquare(matrix: Array<CharArray>): Int =
        if (matrix.isEmpty() || matrix[0].isEmpty())
            0
        else
            eval(matrix.size, matrix[0].size, matrix)

    private fun eval(m: Int, n: Int, matrix: Array<CharArray>): Int {
        val dp = Array(m + 1) { IntArray(n + 1) }
        var max = 0

        for (y in 1..m)
            for (x in 1..n) {
                if (matrix[y - 1][x - 1] == '1') {
                    dp[y][x] = min(dp[y - 1][x - 1], min(dp[y][x - 1], dp[y - 1][x])) + 1
                    max = max(max, dp[y][x])
                }
            }

        // dp.forEach{
        //     println(it.toList())
        // }
        return max * max
    }
}

/*
            0 0 0 0 0 0
1 0 1 0 0   0 1 0 1 0 0
1 0 1 1 1   0 1 0 1 1 1
1 1 1 1 1   0 1 1 1 2 2
1 0 0 1 0   0 1 0 0 0 0

*/
