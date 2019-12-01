package hackerrank.interviewpreparation.linkedlists

import java.util.*

class DoublyLinkedListNode(nodeData: Int) {
    var data: Int = nodeData
    var next: DoublyLinkedListNode? = null
    var prev: DoublyLinkedListNode? = null

}

class DoublyLinkedList {
    var head: DoublyLinkedListNode?
    var tail: DoublyLinkedListNode?

    init {
        head = null
        tail = null
    }

    fun insertNode(nodeData: Int) {
        val node = DoublyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
            node.prev = tail
        }

        tail = node
    }

}

fun printDoublyLinkedList(head: DoublyLinkedListNode?, sep: String) {
    var node = head

    while (node != null) {
        print(node.data)
        node = node.next

        if (node != null) {
            print(sep)
        }
    }
}

// Complete the hackerrank.interviewpreparation.linkedlists.sortedInsert function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data: Int
 *     next: DoublyLinkedListNode
 *     prev: DoublyLinkedListNode
 * }
 *
 */
fun sortedInsert(linkedListNode: DoublyLinkedListNode?, data: Int): DoublyLinkedListNode? {
    return null
}

fun main() {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val linkedListCount = scan.nextLine().trim().toInt()
        val linkedList = DoublyLinkedList()

        for (i in 0 until linkedListCount) {
            val nodeData = scan.nextLine().trim().toInt()
            linkedList.insertNode(nodeData)
        }

        val data = scan.nextLine().trim().toInt()
        val linkedListNode = sortedInsert(linkedList.head, data)

        printDoublyLinkedList(linkedListNode, " ")
    }
}
