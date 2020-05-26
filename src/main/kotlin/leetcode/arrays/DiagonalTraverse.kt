package leetcode.arrays

class DiagonalTraverse {

    fun findDiagonalOrder(matrix: Array<IntArray>): IntArray {

        if (matrix.isEmpty()) return intArrayOf()

        //Keep track of the outbounds of the matrix
        val n = matrix.size
        val m = matrix[0].size

        //indicator of the direction we are moving
        // 1 == up-right
        // 0 == down-left
        var direction = 1

        val ans = IntArray(n * m)

        var row = 0
        var column = 0
        var index = 0

        while (row < n && column < m) {
            ans[index++] = matrix[row][column]
            val newRow = row + if (direction == 1) -1 else 1
            val newColumn = column + if (direction == 1) 1 else -1

            //we've reached the outbounds of the matrix find, the next head
            //in the list.  Note: direction matters.
            if (newRow < 0 || newRow == n || newColumn < 0 || newColumn == m) {
                if (direction == 1) {
                    row += if (column == m - 1) 1 else 0
                    column += if (column < m - 1) 1 else 0
                } else {
                    column += if (row == n - 1) 1 else 0
                    row += if (row < n - 1) 1 else 0
                }

                direction = 1 - direction
            } else {
                row = newRow
                column = newColumn
            }
        }

        return ans
    }
}
