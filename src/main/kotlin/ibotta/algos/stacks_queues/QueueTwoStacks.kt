package ibotta.algos.stacks_queues

class QueueTwoStacks<T> {

    private val out: Stack<T> = Stack()
    private val `in`: Stack<T> = Stack()

    fun dequeue(): T? {
        fill()

        return out.pop()
    }

    fun enqueue(element: T) = `in`.push(element)

    fun peek(): T? {
        fill()
        return out.peek()
    }

    private fun fill() {
        if (out.peek() == null)
            while (`in`.peek() != null)
                out.push(`in`.pop()!!)
    }

}