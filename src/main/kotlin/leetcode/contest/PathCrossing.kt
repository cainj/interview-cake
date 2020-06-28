package leetcode.contest

class PathCrossing {

    fun isPathCrossing(path: String): Boolean {
        var point = 0 to 0
        val points = hashSetOf(point)

        for (d in path) {
            point = when (d) {
                'N' -> point.first + 1 to point.second
                'S' -> point.first - 1 to point.second
                'E' -> point.first to point.second + 1
                'W' -> point.first to point.second - 1
                else -> point
            }
            if (points.contains(point)) return true
            points.add(point)
        }

        return false
    }
}
