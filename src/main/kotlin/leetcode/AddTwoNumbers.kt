package leetcode

fun emptyListNode(): ListNode = ListNode(0)

data class ListNode(var `val`: Int, var next: ListNode? = null)


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    //traverse through the nodes until both node equal null
    var top: ListNode? = l1 ?: emptyListNode()
    var bottom: ListNode? = l2 ?: emptyListNode()
    var result: ListNode? = null
    var tail: ListNode? = null
    var carryOver = false

    while (top != null || bottom != null) {

        val digit = addTwoDigits(top, bottom, carryOver)
        val answer =
            if (top?.next == null && bottom?.next == null)
                digit
            else
                digit % 10


        if (digit > 9)
            carryOver = true

        top = top?.next
        bottom = bottom?.next

        if (result == null) {
            result = ListNode(answer)
            tail = result
        } else {
            tail?.next = ListNode(answer)
            tail = tail?.next
        }
    }

    return result
}

fun addTwoDigits(node1: ListNode?, node2: ListNode?, carryOver: Boolean): Int {

    val first = node1?.`val` ?: 0
    val second = node2?.`val` ?: 0
    var result = first + second

    if (carryOver)
        result++
    return result
}

//999
//999
//1998