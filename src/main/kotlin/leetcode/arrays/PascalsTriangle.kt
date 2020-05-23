package leetcode.arrays

class PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 0) return emptyList()

        val triangle = mutableListOf<List<Int>>()
        var row = 1

        while (row <= numRows) {
            val layer = mutableListOf<Int>()
            for (col in 0 until row)
                if (col == 0 || col == row - 1) layer.add(1)
                else layer.add(triangle[row - 2][col - 1] + triangle[row - 2][col])

            triangle.add(layer)
            row++
        }

        return triangle
    }
}
