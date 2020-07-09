package leetcode.lists

class MereSortedList {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var x = l1
        var y = l2
        val head = ListNode(-1)
        var ans = head

        while (x != null && y != null) {
            if (x.`val` <= y.`val`) {
                val node = ListNode(x.`val`)
                ans.next = node
                x = x.next
            } else {
                val node = ListNode(y.`val`)
                ans.next = node
                y = y.next
            }
            ans = ans.next!!
        }

        while (x != null) {
            val node = ListNode(x.`val`)
            ans.next = node
            x = x.next
            ans = ans.next!!
        }

        while (y != null) {
            val node = ListNode(y.`val`)
            ans.next = node
            y = y.next
            ans = ans.next!!
        }

        return head.next
    }
}
