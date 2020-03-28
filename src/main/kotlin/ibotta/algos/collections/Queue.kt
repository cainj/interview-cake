package ibotta.algos.collections

class Queue<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun dequeue(): T? {
        val temp = head?.data
        head = head?.next
        if (head == null)
            tail = null

        return temp
    }

    fun enqueue(element: T) {
        val temp = Node(element)

        if (tail == null) {
            tail = temp
            head = tail
            return
        }

        tail!!.next = temp
        tail = temp
    }

    fun peek(): T? = head?.data
}
