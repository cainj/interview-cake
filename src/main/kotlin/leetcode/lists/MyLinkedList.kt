package leetcode.lists

class MyLinkedList {

    private var size: Int = 0
    private var head: ListNode = ListNode(-1)


    fun get(index: Int): Int {
        if (index < 0 || index >= size) return -1

        var current: ListNode? = head
        for (i in 0..index)
            current = current?.next
        return current?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        val temp = head.next
        head.next = ListNode(`val`, temp)
        size++
    }

    fun addAtTail(`val`: Int) {
        addAtIndex(size, `val`)
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index > -1) {
            var current: ListNode? = head
            for (i in 0 until index)
                current = current?.next

            val node = ListNode(`val`)
            node.next = current?.next
            current?.next = node
            size++
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        if (index > -1 && index < size) {
            var node: ListNode? = head
            for (i in 0 until index)
                node = node?.next

            node?.next = node?.next?.next
            size--
        }
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */
