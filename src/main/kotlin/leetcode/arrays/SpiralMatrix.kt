package leetcode.arrays

class SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val spiral = mutableListOf<Int>()

        if (matrix.isEmpty()) return spiral

        var maxX = matrix[0].size - 1
        var x = 0
        var maxY = matrix.size - 1
        var y = 0

        while (x <= maxX && y <= maxY) {
            //move right
            for (i in x..maxX) spiral.add(matrix[y][i])
            //move down
            for (i in y + 1..maxY) spiral.add(matrix[i][maxX])
            if (y < maxY && x < maxX) {
                //move left
                for (i in maxX - 1 downTo x + 1) spiral.add(matrix[maxY][i])
                //move up
                for (i in maxY downTo y + 1) spiral.add(matrix[i][x])
            }

            y++
            maxY--
            x++
            maxX--
        }

        return spiral
    }
}
