package leetcode.lists

class MyLinkedList {

    /** Initialize your data structure here. */
    data class Node(val `val`: Int, var next: Node? = null)

    private var size: Int = 0
    private var head: Node = Node(-1)


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int {
        if (index < 0 || index >= size) return -1

        var current: Node? = head
        for (i in 0..index)
            current = current?.next
        return current?.`val` ?: -1
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    fun addAtHead(`val`: Int) {
        val temp = head.next
        head.next = Node(`val`, temp)
        size++
    }

    /** Append a node of value val to the last element of the linked list. */
    fun addAtTail(`val`: Int) {
        addAtIndex(size, `val`)
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    fun addAtIndex(index: Int, `val`: Int) {
        if (index > -1) {
            var current: Node? = head
            for (i in 0 until index)
                current = current?.next

            val node = Node(`val`)
            node?.next = current?.next
            current?.next = node
            size++
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        if (index > -1 && index < size) {
            var node: Node? = head
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
