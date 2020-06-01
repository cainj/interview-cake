package leetcode.recursionII

class Robot(private val room: Array<IntArray>, row: Int, col: Int) {
    private var r = row
    private var c = col
    private var direction = 0

    fun clean() {
        room[r][c] = 2
    }

    private fun doMove() {
        when (direction) {
            0 -> r--
            1 -> c++
            2 -> r++
            3 -> c--
        }
    }

    private fun undoMove() {
        when (direction) {
            0 -> r++
            1 -> c--
            2 -> r--
            3 -> c++
        }
    }

    fun move(): Boolean {
        doMove()
        return if (r >= room.size || c >= room[0].size
            || r < 0 || c < 0
            || room[r][c] == 0
        ) {
            undoMove()
            false
        } else true
    }

    fun turnRight() {
        direction = (direction + 1) % 4
    }

    fun turnLeft() {
        direction = if (direction - 1 < 0) 3 else (direction - 1)
    }
}
