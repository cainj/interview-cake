package leetcode.lists

class RemoveElements {

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val dummyNode = ListNode(-1, head)
        var currNode: ListNode? = dummyNode

        while (currNode?.next != null) {
            if (currNode.next!!.`val` == `val`) currNode.next = currNode.next!!.next
            else currNode = currNode.next
        }

        return dummyNode.next
    }
}
