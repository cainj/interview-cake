package leetcode.queues

class MyCircularQueue(private val k: Int) {
    private val storage = IntArray(k) { -1 }
    private var front: Int = 0
    private var rear: Int = 0
    var size: Int = 0

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    fun enQueue(value: Int): Boolean {
        if (isFull())
            return false

        rear = findNewRear(rear)
        storage[rear] = value
        size++
        return true
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    fun deQueue(): Boolean {
        if (isEmpty()) return false

        storage[front] = -1
        front = findNewHead(front)
        size--
        return true
    }

    /** Get the front item from the queue. */
    fun front(): Int = storage[front]

    /** Get the last item from the queue. */
    fun rear(): Int = storage[rear]

    /** Checks whether the circular queue is empty or not. */
    fun isEmpty(): Boolean = size == 0

    /** Checks whether the circular queue is full or not. */
    fun isFull(): Boolean = size == k

    private fun findNewHead(index: Int): Int {
        var i = index
        while (i != rear) {
            i++
            if (i >= storage.size)
                i = 0
            if (storage[i] != -1)
                return i
        }

        return i
    }

    private fun findNewRear(index: Int): Int {
        if (storage[index] == -1)
            return index

        //find until you cycle
        var i = index + 1
        while (i != front) {
            if (i >= storage.size)
                i = 0
            if (storage[i] == -1)
                return i
            i++
        }

        return i
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */
