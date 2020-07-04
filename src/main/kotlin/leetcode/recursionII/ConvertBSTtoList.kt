package leetcode.recursionII

import leetcode.binarytrees.Node

class ConvertBSTtoList {
    var first: Node? = null
    var last: Node? = null

    fun treeToDoublyList(root: Node?): Node? {
        if (root == null) return root

        helper(root)

        last?.right = first
        first?.left = last
        return first
    }

    private fun helper(node: Node?) {
        if (node != null) {
            if (node.left != null) helper(node.left!!)
            if (last != null) {
                last?.right = node
                node.left = last
            } else first = node

            last = node
            if (node.right != null) helper(node.right!!)
        }
    }
}
