package leetcode.challenge.august

import leetcode.ListNode
import java.util.*

class ReorderList {

    fun reorderList(head: ListNode?): Unit {
        val stack = LinkedList<ListNode?>()
        var currNode: ListNode? = head

        while (currNode != null) {
            stack.push(currNode)
            currNode = currNode.next
        }

        currNode = head
        var hold: ListNode? = null
        if (stack.size <= 2) return

        for (i in 0 until (stack.size / 2)) {
            hold = currNode?.next
            currNode?.next = stack.pop()
            currNode = currNode?.next
            currNode?.next = hold
            currNode = currNode?.next
        }
        currNode?.next = null
    }
}
