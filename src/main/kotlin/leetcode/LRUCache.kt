package leetcode

class LRUCache(private val capacity: Int) {

    private val hashMap = hashMapOf<Int, Node>()

    private class Node(val key: Int = 0, val value: Int = 0, var prev: Node? = null, var next: Node? = null) {
        override fun toString() = "{$key, $value}"
    }

    private val head = Node()
    private val tail = Node()

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        return if (hashMap.contains(key)) {
            val node = hashMap[key]!!
            hashMap.remove(key)
            remove(node)
            addToFront(key, node)
            node.value
        } else -1

    }

    fun put(key: Int, value: Int) {
        val node = Node(key, value)

        if (hashMap.contains(key))
            remove(hashMap[key]!!)
        
        hashMap[key] = node
        addToFront(key, node)
        if (capacity < hashMap.size) {
            val last = tail.prev!!
            tail.prev = last.prev
            last.prev?.next = tail
            hashMap.remove(last.key)
        }
    }

    private fun remove(node: Node) {
        val prev = node.prev!!
        prev.next = node.next
        node.next?.prev = prev
    }

    private fun addToFront(key: Int, node: Node) {
        val second = head.next
        head.next = node
        node.next = second
        node.prev = head
        second?.prev = node
        hashMap[key] = node
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
