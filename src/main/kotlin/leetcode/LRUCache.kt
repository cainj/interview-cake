package leetcode

class LRUCache(private val capacity: Int) {
    private val cache = mutableMapOf<Int, Node>()

    private class Node(var key: Int? = null, var value: Int? = null, var prev: Node? = null, var next: Node? = null)

    private var head = Node(0)
    private var tail = Node(0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        if (cache.contains(key)) {
            val node = cache[key]!!
            remove(node)
            add(node)
            return node.value!!
        }
        return -1
    }

    fun put(key: Int, value: Int) {
        val node = Node(key, value)
        if (cache.contains(key)) {
            remove(cache[key]!!)
            cache.remove(key)
        }

        if (cache.size == capacity) {
            val last = tail.prev!!
            last.prev?.next = tail
            tail.prev = last.prev
            cache.remove(last.key)
        }

        add(node)
        cache[key] = node
    }

    private fun remove(node: Node) {
        val next = node.next!!
        val prev = node.prev!!
        prev.next = next
        next.prev = prev
    }

    //adds to the head
    private fun add(node: Node) {
        val next = head.next!!
        node.next = next
        node.prev = head
        next.prev = node
        head.next = node
    }

}
