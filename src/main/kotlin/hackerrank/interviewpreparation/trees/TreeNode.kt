package hackerrank.interviewpreparation.trees

import hackerrank.interviewpreparation.trees.TreeNode.Companion.checkBSTRecursive

data class TreeNode(val data: Int, var left: TreeNode? = null, var right: TreeNode? = null) {

    fun insert(value: Int) {
        if (value < data) {
            if (left == null)
                left = TreeNode(value)
            else
                left?.insert(value)

        } else {
            if (right == null)
                right = TreeNode(value)
            else
                right?.insert(value)
        }
    }

    fun contains(value: Int): Boolean {
        return when {
            value == data -> true
            value > data -> right?.contains(value) ?: false
            else -> left?.contains(value) ?: false

        }
    }

    fun printInOrder(list: MutableList<Int>): List<Int> {
        if (left != null)
            left?.printInOrder(list)
        list.add(data)
        if (right != null)
            right?.printInOrder(list)
        return list
    }

    fun printPreOrder() {
        println(data)
        if (left != null)
            left?.printPreOrder()
        if (right != null)
            right?.printPreOrder()
    }

    fun checkBST(root: TreeNode): Boolean {
        val list = root.printInOrder(mutableListOf())
        var i = 0
        var j = 1
        while (j < list.size) {
            //println("${list[i]} - ${list[j]}")
            if (list[i] > list[j])
                return false
            i++
            j++
        }
        return true
    }

    companion object {
        fun checkBSTRecursive(root: TreeNode?, lowerBounds: Int, upperBounds: Int): Boolean {
            if (root == null)
                return true
            val data = root.data
            if (data < lowerBounds || data > upperBounds)
                return false
            return checkBSTRecursive(root.left, lowerBounds, data) && checkBSTRecursive(root.right, data, upperBounds)
        }
    }
}


fun main() {

    val rightTree = TreeNode(5)
    rightTree.insert(6)
    rightTree.insert(1)

    val leftTree = TreeNode(2)
    leftTree.insert(1)
    val rootNode = TreeNode(3, leftTree, rightTree)

    println(checkBSTRecursive(rootNode, Int.MIN_VALUE, Int.MAX_VALUE))
    //rootNode.printInOrder()
}