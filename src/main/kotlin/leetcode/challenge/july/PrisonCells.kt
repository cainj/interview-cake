package leetcode.challenge.july

/**
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.
 *
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 *
 * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 * Otherwise, it becomes vacant.
 * (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
 *
 * We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.
 * Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)
 *
 * Example 1:
 * Input: cells = [0,1,0,1,1,0,0,1], N = 7
 * Output: [0,0,1,1,0,0,0,0]
 *
 * Explanation:
 *  The following table summarizes the state of the prison on each day:
 *  Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
 *  Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
 *  Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
 *  Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
 *  Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
 *  Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
 *  Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
 *  Day 7: [0, 0, 1, 1, 0, 0, 0, 0]
 *
 * Example 2:
 *  Input: cells = [1,0,0,1,0,0,1,0], N = 1000000000
 *  Output: [0,0,1,1,1,1,1,0]
 */
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
