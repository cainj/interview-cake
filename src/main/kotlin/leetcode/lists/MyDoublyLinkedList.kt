package leetcode.lists

class MyDoublyLinkedList {

    /** Initialize your data structure here. */
    data class ListNode(val `val`: Int, var prev: ListNode? = null, var next: ListNode? = null)

    private var dummyHead: ListNode = ListNode(-1)
    private var dummyTail: ListNode = ListNode(-2)
    private var size = 0

    init {
        dummyHead.next = dummyTail
        dummyTail.prev = dummyHead
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int = getNode(index)?.`val` ?: -1

    private fun getNode(index: Int): ListNode? {
        if (index < 0 || index >= size) return null
        var i = 0
        var currNode = dummyHead

        while (i++ <= index) currNode = currNode.next!!
        return currNode
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will
     * be the first node of the linked list. */
    fun addAtHead(`val`: Int) {
        val node = ListNode(`val`, dummyHead, dummyHead.next)
        dummyHead.next?.prev = node
        dummyHead.next = node
        size++
    }

    /** Append a node of value val to the last element of the linked list. */
    fun addAtTail(`val`: Int) {
        val node = ListNode(`val`, dummyTail.prev, dummyTail)
        dummyTail.prev?.next = node
        dummyTail.prev = node
        size++
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length
     * of linked list, the node will be appended to the end of linked list. If index is greater than the length,
     * the node will not be inserted. */
    fun addAtIndex(index: Int, `val`: Int) {
        if (index > size || index < 0) return

        if (index == 0) addAtHead(`val`)
        else if (index == size) addAtTail(`val`)
        else {
            var i = 0
            var prevNode = dummyHead.next
            while (++i < index) prevNode = prevNode?.next
            val node = ListNode(`val`, prevNode, prevNode?.next)
            prevNode?.next?.prev = node
            prevNode?.next = node
            size++
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        val node = getNode(index) ?: return
        val prev = node.prev
        val next = node.next
        prev?.next = next
        next?.prev = prev
        size--
    }
}
