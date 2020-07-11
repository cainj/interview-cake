package leetcode.challenge.july

import leetcode.lists.Node

class FlattenDoubleLinkedList {

    fun flatten(root: Node?): Node? {

        var currNode = root
        while (currNode != null) {
            if (currNode.child != null) {
                val children = flatten(currNode.child)
                currNode.child = null
                val hold = currNode.next
                currNode.next = children
                children?.prev = currNode
                while (currNode?.next != null) currNode = currNode.next
                currNode?.next = hold
                hold?.prev = currNode
            }
            currNode = currNode?.next
        }
        // var x = root
        // while(x != null){
        //     println("node:${x.`val`}, prev:${x.prev?.`val`},next:${x.next?.`val`}")
        //     x = x.next
        // }
        // println("******")
        return root
    }
}
