package leetcode.lists

class OddEvenList {

    fun oddEvenList(list: ListNode?): ListNode? {
        val head = list ?: return null

        var oddNode = head
        val even = head.next

        var evenNode = head.next

        while (oddNode.next != null) {
            oddNode.next = oddNode.next?.next
            evenNode?.next = evenNode?.next?.next

            if (oddNode.next == null) break
            oddNode = oddNode.next!!
            evenNode = evenNode?.next
        }

        oddNode.next = even
        return head
    }
}
