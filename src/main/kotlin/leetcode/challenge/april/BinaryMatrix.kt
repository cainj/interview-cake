package leetcode.challenge.april

class BinaryMatrix(private val matrix: Array<IntArray>) {
    fun dimensions() = listOf(matrix.size, matrix[0].size)

    fun get(row: Int, col: Int): Int = matrix[row][col]
}
