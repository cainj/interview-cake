package leetcode


data class ListNode(var `val`: Int, var next: ListNode? = null)

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    //traverse through the nodes until both node equal null
    var top: ListNode? = l1
    var bottom: ListNode? = l2
    var result: ListNode? = null
    var tail: ListNode? = null
    var carryOver = false
    var digit = 0

    while (top != null || bottom != null) {

        digit = addTwoDigits(top, bottom, carryOver)
        carryOver = digit > 9

        top = top?.next
        bottom = bottom?.next

        if (result == null) {
            result = ListNode(digit % 10)
            tail = result
        } else {
            tail?.next = ListNode(digit % 10)
            tail = tail?.next
        }
    }

    if (digit > 9)
        tail?.next = ListNode(1)

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
