package ibotta.algos.collections

class QueueTwoStacks<T> {

    private val out: Stack<T> = Stack()
    private val incoming: Stack<T> = Stack()

    fun dequeue(): T? {
        fill()

        return out.pop()
    }

    fun enqueue(element: T) = incoming.push(element)

    fun peek(): T? {
        fill()
        return out.peek()
    }

    private fun fill() {
        if (out.peek() == null)
            while (incoming.peek() != null)
                out.push(incoming.pop()!!)
    }
}
