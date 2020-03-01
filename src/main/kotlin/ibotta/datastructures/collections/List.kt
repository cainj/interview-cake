package ibotta.datastructures.collections

class Node<T>(val data: T, var next: Node<T>? = null)

class List<T>(vararg elements: T) {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size: Int = 0

    init {
        for (element in elements)
            append(element)
    }

    fun append(element: T) {
        val node = Node(element)

        if (tail != null)
            tail?.next = node
        else
            head = node

        tail = node
        size++
    }

    fun prepend(element: T) {
        val node = Node(element, head)
        if (head == null)
            tail = node

        head = node
        size++
    }

    fun removeAt(index: Int): T {
        val data = when {
            (index < 0 || index > size) -> throw IndexOutOfBoundsException("Index $index is out of bounds.")
            index == 0 -> {
                val temp = head
                head = head!!.next
                tail = head
                temp!!.data
            }
            else -> {
                var prevNode = head
                var rover = 1
                while (rover < index) {
                    prevNode = prevNode?.next
                    rover++
                }

                val removeNode = prevNode?.next
                prevNode!!.next = removeNode!!.next
                if (size - 1 == index)
                    tail = prevNode
                removeNode.data
            }
        }

        size--
        return data
    }

    fun contains(element: T): Boolean {
        var current = head
        while (current != null) {
            if (current.data == element)
                return true
            current = current.next
        }

        return false
    }

    fun insertAt(element: T, index: Int) {
        when {
            (index > size) -> throw IndexOutOfBoundsException("Index $index is out of bounds.")
            else -> {
                var prevNode = head
                var rover = 1
                while (rover < index) {
                    prevNode = prevNode?.next
                    rover++
                }

                val node = Node(element, prevNode!!.next)
                prevNode.next = node

                if (size == index)
                    tail = node
            }
        }

        size++
    }

    fun kthFromLast(kth: Int): T {
        if (kth >= size) throw IndexOutOfBoundsException("kth $kth is out of bounds.")

        var counter = 0
        var current = head
        var rover = current

        while (current?.next != null) {
            if (counter == kth)
                rover = rover?.next
            else
                counter++
            current = current.next
        }

        return rover!!.data
    }

    fun interleave(other: List<T>): List<T> {
        TODO()
    }

    fun first(): T? = head?.data

    fun last(): T? = tail?.data

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        val buffer = StringBuffer("[${head?.data}")
        var current = head?.next

        while (current != null) {
            buffer.append(", ${current.data}")
            current = current.next
        }

        buffer.append("]")
        return String(buffer)
    }

    companion object {
        fun <T> hasCycle(head: Node<T>): Boolean {
            var fast: Node<T>? = head.next?.next
            var slow: Node<T>? = head

            while (fast?.data != slow?.data && (fast != null || slow != null)) {
                slow = slow?.next
                fast = fast?.next?.next
            }

            return fast == slow
        }
    }
}
