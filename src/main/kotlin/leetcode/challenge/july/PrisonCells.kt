package leetcode.challenge.july

class PrisonCells {

    fun prisonAfterNDays(cells: IntArray, N: Int): IntArray {
        var ans = cells
        val set = hashSetOf<String>()
        var size = 0
        var flag = true

        for (i in 0 until N) {
            val nextDay = nextDay(ans)
            val str = nextDay.contentToString()
            if (!set.contains(str)) {
                set.add(str)
                size++
            } else {
                flag = true
                break
            }
            ans = nextDay
        }


        if (flag) {
            val n = N % size
            for (i in 1..n)
                ans = nextDay(ans)
        }
        return ans
    }

    private fun nextDay(cells: IntArray): IntArray {
        val result = IntArray(8)

        for (col in 1..6)
            if (cells[col + 1] == cells[col - 1]) result[col] = 1

        return result
    }
}
