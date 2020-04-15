package leetcode.binarytrees

import java.util.*
import kotlin.math.max


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

fun inorderTraversal(root: TreeNode?, order: MutableList<Int> = mutableListOf()): List<Int> {

//    if(root != null) {
//        inorderTraversal(root.left, order)
//        order.add(root.`val`)
//        inorderTraversal(root.right, order)
//    }
//
//    return order


    val linkedList = LinkedList<TreeNode>()

    linkedList.push(root)

    while (linkedList.isNotEmpty()) {

        var node = linkedList.peek()

        if (node.left != null)
            linkedList.push(node.left)
        else {

            order.add(linkedList.pop().`val`)

            if (linkedList.peek() != null) {
                node = linkedList.pop()
                order.add(node.`val`)
            }

            if (node.right != null)
                linkedList.push(node.right)
        }
    }

    return order
}

fun postorderTraversal(root: TreeNode?): List<Int> {
    //recursive
//    if(root != null){
//
//        if(root.left != null)
//            postorderTraversal(root.left, ans)
//        if(root.right != null)
//            postorderTraversal(root.right, ans)
//
//        ans.add(root.`val`)
//    }
//
//    return ans


    val stack = LinkedList<TreeNode>()
    val order = LinkedList<TreeNode>()

    if (root != null)
        stack.push(root)

    while (stack.isNotEmpty()) {
        val node = stack.pop()

        if (node.left != null)
            stack.push(node.left)
        if (node.right != null)
            stack.push(node.right)

        order.push(node)
    }

    return order.map { it.`val` }
}

fun levelOrder(root: TreeNode?, ans: MutableList<List<Int>> = mutableListOf()): List<List<Int>> {

    val deque = ArrayDeque<List<TreeNode>>()

    if (root != null)
        deque.offer(listOf(root))

    while (deque.isNotEmpty()) {
        val nodes = deque.poll()
        val children = mutableListOf<TreeNode>()
        val levels = mutableListOf<Int>()

        for (node in nodes) {
            if (node.left != null)
                children.add(node.left)
            if (node.right != null)
                children.add(node.right)

            levels.add(node.`val`)
        }


        if (children.isNotEmpty())
            deque.offer(children)

        ans.add(levels)
    }

    return ans
}

fun maxDepth(root: TreeNode?): Int {
    if (root == null)
        return 0

    return max(maxDepth(root.left), maxDepth(root.right)) + 1
}

fun isSymmetric(root: TreeNode?): Boolean = helper(root, root)

private fun helper(node: TreeNode?, otherNode: TreeNode?): Boolean {
    if (node?.`val` != otherNode?.`val`)
        return false

    if (isLeaf(node) && isLeaf(otherNode))
        return true

    return helper(node?.left, otherNode?.right) && helper(node?.right, otherNode?.left)
}

private fun isLeaf(node: TreeNode?) = node?.left == null && node?.right == null


//Hints from Leetcode
fun isSymmetricBFS(root: TreeNode?): Boolean {
    val q: Queue<TreeNode?> = LinkedList<TreeNode?>()

    if (root == null)
        return true

    q.add(root)
    q.add(root)
    while (!q.isEmpty()) {
        val t1 = q.poll()
        val t2 = q.poll()
        if (t1 == null && t2 == null) continue
        if (t1 == null || t2 == null) return false
        if (t1.`val` != t2.`val`) return false
        q.add(t1.left)
        q.add(t2.right)
        q.add(t1.right)
        q.add(t2.left)
    }

    return true
}

fun hasPathSum(root: TreeNode?, sum: Int): Boolean =
    if (root == null)
        false
    else
        findSum(root).contains(sum)

private fun findSum(node: TreeNode, sum: Int = 0, paths: HashSet<Int> = hashSetOf()): Set<Int> {
    if (isLeaf(node)) {
        paths.add(sum + node.`val`)
        return paths
    } else {
        val newPath = sum + node.`val`
        if (node.left != null)
            findSum(node.left, newPath, paths)
        if (node.right != null)
            findSum(node.right, newPath, paths)
    }

    return paths
}
