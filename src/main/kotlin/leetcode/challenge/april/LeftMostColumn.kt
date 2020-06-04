package leetcode.challenge.april

class LeftMostColumn {

    fun leftMostColumnWithOne(bm: BinaryMatrix): Int {
        val dim = bm.dimensions()
        var l = 0
        var r = dim[1]
        var ans = -1

        while (l < r) {
            var col = l + (r - l) / 2
            var rover = -1

            for (i in 0 until dim[0]) {
                if (1 == bm.get(i, col)) {
                    rover = i
                    break
                }
            }

            //if '1' found then back track
            if (rover != -1) {
                while (col >= 0) {
                    if (bm.get(rover, col) != 1) {
                        col++
                        ans = col
                        break
                    } else if (col == 0) return 0
                    col--
                }
                r = col
            } else l = col + 1
        }

        return ans
    }
}
