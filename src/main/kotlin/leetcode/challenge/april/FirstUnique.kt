package leetcode.challenge.april

class FirstUnique(nums: IntArray) {

    private data class Node(val value: Int, var prev: Node? = null, var next: Node? = null)

    private val map = hashMapOf<Int, Node>()
    private val head = Node(0)
    private val tail = Node(0)

    init {
        head.next = tail
        tail.prev = head
        for (i in nums)
            add(i)
    }

    fun showFirstUnique(): Int =
        if (head.next != null && head.next?.value != 0)
            head.next!!.value
        else
            -1

    fun add(value: Int) {
        if (map.contains(value)) remove(map[value]!!)
        else {
            val node = Node(value)
            addToBack(node)
            map[value] = node
        }
    }

    private fun addToBack(node: Node) {
        val wasLast = tail.prev
        wasLast?.next = node
        node.next = tail
        node.prev = wasLast
        tail.prev = node
    }

    private fun remove(node: Node) {
        val prev = node.prev
        prev?.next = node.next
        val next = node.next
        next?.prev = prev
        node.next = null
        node.prev = null
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * var obj = FirstUnique(nums)
 * var param_1 = obj.showFirstUnique()
 * obj.add(value)
 */
