package interviewcake

import java.util.*


class QueueTwoStacks {

    private var inStack = ArrayDeque<Int>()
    private var outStack = ArrayDeque<Int>()

    fun enqueue(item: Int) = inStack.push(item)

    fun dequeue(): Int {
        if (outStack.size < 1) {
            while (inStack.isNotEmpty())
                outStack.push(inStack.pop())
        }
        return outStack.pop()
    }
}