package hackerrank.datastructures

interface QueueLike<A> {
    fun enqueue(obj: A)
    fun dequeue(): A
}

class Queue<A> : QueueLike<A> {

    private var enqueue = mutableListOf<A>()
    private var dequeue = mutableListOf<A>()

    override fun dequeue(): A {
        if (dequeue.isEmpty()) {
            dequeue = enqueue.asReversed()
            enqueue = mutableListOf()
        }
        return dequeue.removeAt(0)
    }

    override fun enqueue(obj: A) = enqueue.add(0, obj)

}

fun main() {
    val queue = Queue<String>()
    queue.enqueue("a")
    queue.enqueue("b")
    queue.enqueue("c")
    queue.enqueue("d")

    println(queue.dequeue())
    println(queue.dequeue())
    queue.enqueue("e")
    queue.enqueue("f")
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
}