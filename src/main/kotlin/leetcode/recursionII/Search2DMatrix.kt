package leetcode.recursionII

class Search2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean =
        if (matrix.isEmpty()) false
        else search(0, matrix[0].size - 1, 0, matrix.size - 1, matrix, target)

    private fun search(l: Int, r: Int, u: Int, d: Int, matrix: Array<IntArray>, target: Int): Boolean {
        if (l > r || u > d) return false
        else if (target < matrix[u][l] || target > matrix[d][r]) return false

        val mid = l + (r - l) / 2

        // Locate `row` such that matrix[row-1][mid] < target < matrix[row][mid]
        var row = u
        while (row <= d && matrix[row][mid] <= target) {
            if (matrix[row][mid] == target) return true
            row++
        }

        return search(l, mid - 1, row, d, matrix, target) || search(mid + 1, r, u, row - 1, matrix, target)
    }
}
