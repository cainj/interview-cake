package interviewcake

fun containsCycle(firstNode: LinkedListNode?): Boolean {

    var leader: LinkedListNode? = firstNode
    var trailer: LinkedListNode? = firstNode

    while (leader?.next != null) {
        trailer = trailer!!.next
        leader = leader.next!!.next

        if (leader == trailer)
            return true
    }

    return false
}
