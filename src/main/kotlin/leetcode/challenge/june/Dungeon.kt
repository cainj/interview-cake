package leetcode.challenge.june

import kotlin.math.max
import kotlin.math.min

class Dungeon {

    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val ans = Array(dungeon.size) { IntArray(dungeon[0].size) }
        val row = dungeon.size - 1
        val col = dungeon[0].size - 1

        ans[row][col] = if (dungeon[row][col] > 0) 1 else 1 - dungeon[row][col]


        for (i in row - 1 downTo 0)
            ans[i][col] = max(ans[i + 1][col] - dungeon[i][col], 1)
        for (j in col - 1 downTo 0)
            ans[row][j] = max(ans[row][j + 1] - dungeon[row][j], 1)

        for (i in row - 1 downTo 0)
            for (j in col - 1 downTo 0)
                ans[i][j] = max(min(ans[i + 1][j], ans[i][j + 1]) - dungeon[i][j], 1)
        // ans.forEach{
        //     println(it.toList())
        // }
        return ans[0][0]
    }
}
