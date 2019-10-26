package leetcode


fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    val (x, y) = coordinates[0]
    val (x2, y2) = coordinates[1]
    val deltaY = y2 - y
    val deltaX = x2 - x
    val slope = if (deltaX == 0) {
        0.0
    } else {
        deltaY.toDouble() / deltaX.toDouble()
    }

    for (i in 1..coordinates.size - 2) {
        val (w, z) = coordinates[i]
        val (w2, z2) = coordinates[i + 1]
        val currentDeltaY = z2 - z
        val currentDeltaX = w2 - w
        val currentSlope = if (currentDeltaX == 0) {
            0.0
        } else {
            currentDeltaY.toDouble() / currentDeltaX.toDouble()
        }

        if (currentSlope != slope)
            return false
    }
    return true
}
