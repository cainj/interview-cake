package leetcode.queues

import java.util.*

class MovingDataStream(val size: Int) {

    /** Initialize your data structure here. */
    private val deque: Queue<Int> = ArrayDeque(size)
    private var rover: Double = 0.0

    fun next(num: Int): Double {
        if (size == 0) return Double.NaN

        if (deque.size == size)
            rover -= deque.poll()

        deque.offer(num)
        rover += num
        return rover / deque.size
    }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = MovingAverage(size)
 * var param_1 = obj.next(`val`)
 */
