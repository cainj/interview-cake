package leetcode.binarytrees

import java.util.*

data class TreeNode(val `val`: Int, val left: TreeNode? = null, val right: TreeNode? = null)

fun preorderTraversal(root: TreeNode?, order: List<Int>): List<Int> {

    var bucket = order
//    recursive
//    if (root != null) {
//        val o = order.plus(root.`val`)
//        bucket = preorderTraversal(root.left, o)
//        bucket = preorderTraversal(root.right, bucket)
//    }

    val deque = ArrayDeque<ArrayDeque<TreeNode>>()
    val l = ArrayDeque<TreeNode>()

    if (root != null) {
        l.push(root)
        deque.offer(l)
    }

    while (deque.isNotEmpty()) {

        val newChildren = ArrayDeque<TreeNode>()
        val children = deque.poll()
        if (children.isNotEmpty()) {
            val node = children.pop()
            bucket = bucket.plus(node.`val`)

            if (node.left != null)
                newChildren.offer(node.left)
            if (node.right != null)
                newChildren.offer(node.right)

            while (children.isNotEmpty())
                newChildren.offer(children.poll())

            deque.offer(newChildren)
        }
    }

    return bucket
}

private val order = mutableListOf<Int>()

fun inorderTraversal(root: TreeNode?, order: MutableList<Int> = mutableListOf()): List<Int> {

    if(root != null) {
        inorderTraversal(root.left, order)
        order.add(root.`val`)
        inorderTraversal(root.right, order)
    }

    return order
}
