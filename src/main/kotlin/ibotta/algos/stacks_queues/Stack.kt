package ibotta.algos.stacks_queues

class Stack<T> {

    private var head: Node<T>? = null

    fun push(element: T) {
        head = Node(element, head)
    }

    fun pop(): T? {
        val temp = head?.data
        head = head?.next
        return temp
    }

    fun peek(): T? = head?.data
}
