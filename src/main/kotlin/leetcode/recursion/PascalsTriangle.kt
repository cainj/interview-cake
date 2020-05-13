package leetcode.recursion

class PascalsTriangle {

    private val cache = hashMapOf<Pair<Int, Int>, Int>()

    //Space Complexity is O(k) where k = the rowIndex
    //Runtime Complexity is O(k^2)
    fun getRow(rowIndex: Int): List<Int> {
        val ans = mutableListOf<Int>()
        for (j in rowIndex downTo 0)
            ans.add(calculate(rowIndex, j))

        return ans
    }

    private fun calculate(row: Int, col: Int): Int {

        if (cache.contains(row to col))
            return cache[row to col]!!

        val computedVal =
            if (row - col <= 0 || col == 0 || row == 0) 1 else calculate(row - 1, col - 1) + calculate(row - 1, col)
        cache[row to col] = computedVal

        return computedVal
    }
}
