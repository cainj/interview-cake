package leetcode.queues

import java.util.*


class PerfectSquares {

    fun numSquares(n: Int): Int {
        if(n == 0) return 0

        val squares = ArrayList<Int>()
        var i = 1

        while (i * i <= n) {
            squares.add(i * i)
            ++i
        }

        var queue = HashSet<Int>()
        var level = 0

        queue.add(n)

        while (queue.isNotEmpty()) {
            level += 1
            val nextQueue = HashSet<Int>()
            for (remainder in queue)
                for (square in squares)
                    if (remainder == square)
                        return level
                    else if (remainder < square)
                        break
                    else
                        nextQueue.add(remainder - square)

            queue = nextQueue
        }

        return level
    }

}