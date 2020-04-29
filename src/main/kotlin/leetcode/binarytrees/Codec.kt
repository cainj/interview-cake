package leetcode.binarytrees

import java.util.*

class Codec {

    // Encodes a URL to a shortened URL.
    //Runtime is O(n)
    //Space complexity is O(n)
    fun serialize(root: TreeNode?): String {
        val sb = StringBuilder()
        buildSerializer(root, sb)
        if (sb.last() == ',')
            sb.deleteCharAt(sb.length - 1)
        return sb.toString()
    }

    private fun buildSerializer(node: TreeNode?, sb: StringBuilder) {
        if (node == null) {
            sb.append("null").append(",")
            return
        }
        sb.append(java.lang.String.valueOf(node.`val`))
        sb.append(',')
        buildSerializer(node.left, sb)
        buildSerializer(node.right, sb)
    }

    // Decodes your encoded data to tree.
    //Runtime is O(n)
    //Space complexity is O(n)
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
