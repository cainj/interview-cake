package leetcode.challenge.june

class UniquePaths {

    fun findUniquePaths(m: Int, n: Int): Int {

        val ans = Array(n) { IntArray(m) { 1 } }

        for (row in 1 until n)
            for (col in 1 until m)
                ans[row][col] = ans[row - 1][col] + ans[row][col - 1]

        return ans[n - 1][m - 1]
    }
}
