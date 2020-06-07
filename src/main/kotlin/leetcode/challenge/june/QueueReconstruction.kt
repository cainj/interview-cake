package leetcode.challenge.june

/**
 * Suppose you have a random list of people standing in a queue. Each person is described by a
 * pair of integers (h, k), where h is the height of the person and k is the number of people
 * in front of this person who have a height greater than or equal to h. Write an algorithm
 * to reconstruct the queue.
 */
class QueueReconstruction {

    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        val sorted = people.sortedWith(compareBy({ -it[0] }, { it[1] }))
        val queue = mutableListOf<IntArray>()

        for (p in sorted)
            queue.add(p[1], p)
        return queue.toTypedArray()
    }
}
