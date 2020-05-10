package leetcode.stacks

class FloodFill {

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val color = image[sr][sc]
        if (color != newColor)
            flood(image, sr, sc, newColor, color)
        return image
    }

    private fun flood(image: Array<IntArray>, row: Int, col: Int, newColor: Int, oldColor: Int) {
        if ((row < 0 || col < 0)
            || (row > image.size - 1 || col > image[0].size - 1)
            || image[row][col] != oldColor
        ) {
            return
        }

        image[row][col] = newColor
        flood(image, row + 1, col, newColor, oldColor)
        flood(image, row - 1, col, newColor, oldColor)
        flood(image, row, col + 1, newColor, oldColor)
        flood(image, row, col - 1, newColor, oldColor)

    }
}
