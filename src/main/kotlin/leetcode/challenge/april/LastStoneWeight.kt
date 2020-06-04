package leetcode.challenge.april

import java.util.PriorityQueue

class LastStoneWeight {


    fun lastStoneWeight(stones: IntArray): Int {
        val sortedStones = PriorityQueue(Comparator.reverseOrder<Int>())
        for (i in stones.indices)
            sortedStones.add(stones[i])

        while (sortedStones.size > 1)
            smash(sortedStones)

        return if (sortedStones.isEmpty()) 0 else sortedStones.peek()
    }

    private fun smash(stones: PriorityQueue<Int>) {
        val y = stones.poll()
        val x = stones.poll()

        if (x != y)
            stones.offer(y - x)
    }
}
