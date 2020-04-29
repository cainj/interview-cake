package leetcode.binarytrees

import java.util.*

class Codec {

    // Encodes a URL to a shortened URL.
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        val sb = StringBuilder()
        buildSerialzer(root, sb)
        if (sb.last() == ',')
            sb.deleteCharAt(sb.length - 1)
        return sb.toString()
    }

    private fun buildSerialzer(node: TreeNode?, sb: StringBuilder) {
        if (node == null) {
            sb.append("null").append(",")
            return
        }
        sb.append(java.lang.String.valueOf(node.`val`))
        sb.append(',')
        buildSerialzer(node.left, sb)
        buildSerialzer(node.right, sb)
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val deque: Queue<String> = ArrayDeque()
        deque.addAll(data.split(","))
        return buildTree(deque)
    }

    private fun buildTree(deque: Queue<String>): TreeNode? {
        val value = deque.poll()
        if (value == "null") return null

        val node = TreeNode(value.toInt())
        node.left = buildTree(deque)
        node.right = buildTree(deque)

        return node
    }
}
