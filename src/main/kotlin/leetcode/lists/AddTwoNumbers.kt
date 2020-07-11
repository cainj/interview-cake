package leetcode.lists

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var top = l1
        var bottom = l2
        val pseudoHead = ListNode(-1)
        var currNode = pseudoHead
        var carryOver = 0

        while (top != null || bottom != null) {
            val one = top?.`val` ?: 0
            val two = bottom?.`val` ?: 0
            var ans = one + two + carryOver

            if (ans > 9) {
                ans %= 10
                carryOver = 1
            } else carryOver = 0

            if (top?.next == null && bottom?.next == null && carryOver == 1) currNode.next = ListNode(ans, ListNode(1))
            else currNode.next = ListNode(ans)

            currNode = currNode.next!!
            top = top?.next
            bottom = bottom?.next
        }

        return pseudoHead.next
    }
}
