package leetcode.binarytrees

import java.util.*

class ConstructBinaryTreeFromString {

    //This algorithm complexity is O(n) runtime with O(n) space
    private val stack = LinkedList<TreeNode>()

    fun str2tree(s: String): TreeNode? {

        if (s.isEmpty()) return null

        var num = StringBuilder()

        for (c in s) {
            if (c == '-' || c.isDigit()) num.append(c)
            else if (c == ')') {
                if (num.isNotEmpty()) {
                    val parent = stack.peek()
                    if (parent.left == null) parent.left = TreeNode(num.toString().toInt())
                    else parent.right = TreeNode(num.toString().toInt())
                    num = StringBuilder()
                } else {
                    val node = stack.pop()
                    val parent = stack.peek()
                    if (parent.left == null) parent.left = node
                    else parent.right = node
                }
            } else {
                if (num.isNotEmpty()) {
                    stack.push(TreeNode(num.toString().toInt()))
                    num = StringBuilder()
                }
            }
        }

        return if (stack.isEmpty()) TreeNode(num.toString().toInt()) else stack.peek()
    }
}
