package leetcode.recursion

import leetcode.ListNode

class ReverseLinkedList {

    fun reverseListRec(tail: ListNode?): ListNode? {
        if (tail?.next == null) return tail

        val hold = reverseList(tail.next)
        tail.next?.next = tail
        tail.next = null
        return hold
    }

    fun reverseList(tail: ListNode?): ListNode? {
        var currNode = tail
        var head: ListNode? = null

        while (currNode != null) {
            head = ListNode(currNode.`val`, head)
            currNode = currNode.next
        }

        return head
    }

    private fun printNodes(n: ListNode?) {
        var node = n
        while (node != null) {
            println(node.`val`)
            node = node.next
        }
    }
}
