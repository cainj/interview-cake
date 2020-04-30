package leetcode.queues

class MyCircularQueue(val size: Int) {
    private val storage = IntArray(size) { -1 }
    private var front: Int = -1
    private var rear: Int = -1

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    fun enQueue(value: Int): Boolean {
        if (isFull())
            return false

        if (isEmpty())
            front = 0

        rear = (rear + 1) % size
        storage[rear] = value
        return true
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    fun deQueue(): Boolean {
        if (isEmpty()) return false

        if (front == rear) {
            front = -1
            rear = -1
            return true
        }
        front = (front + 1) % size
        return true
    }

    /** Get the front item from the queue. */
    fun front(): Int =
        if (isEmpty()) -1
        else storage[front]

    /** Get the last item from the queue. */
    fun rear(): Int =
        if (isEmpty()) -1
        else storage[rear]

    /** Checks whether the circular queue is empty or not. */
    fun isEmpty(): Boolean = front == -1

    /** Checks whether the circular queue is full or not. */
    fun isFull(): Boolean = ((rear + 1) % size) == front

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
