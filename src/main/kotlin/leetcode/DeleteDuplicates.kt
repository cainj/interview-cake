package leetcode

class DeleteDuplicates {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var currNode = head
        while (currNode != null) {
            if (currNode.`val` == currNode.next?.`val`) currNode.next = currNode.next?.next
            else currNode = currNode.next
        }

        return head
    }
}
