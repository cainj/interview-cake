package leetcode.recursion

import leetcode.ListNode

class ReverseLinkedList {

    fun reverseList(tail: ListNode?): ListNode? {
        if(tail?.next == null) return tail

        val hold = reverseList(tail.next)
        tail.next?.next = tail
        tail.next = null
        return hold
    }

    private fun printNodes(n: ListNode?) {
        var node = n
        while (node != null) {
            println(node.`val`)
            node = node.next
        }
    }
}
