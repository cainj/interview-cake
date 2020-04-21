package leetcode.challenge

import leetcode.binarytrees.TreeNode

class BstFromPreorder {
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        //[8,5,1,7,10,12]
        return buildTree(0, preorder.size - 1, preorder)
    }

    private fun buildTree(i: Int, endIndex: Int, preorder: IntArray): TreeNode? {
        if (i > endIndex) return null

        val value = preorder[i]
        val node = TreeNode(value)

        if (i == endIndex) return node

        val iIndex = search(preorder, i, endIndex, node.`val`)

        node.left = buildTree(i + 1, iIndex - 1, preorder)
        node.right = buildTree(iIndex, endIndex, preorder)

        return node
    }

    private fun search(preorder: IntArray, index: Int, endIndex: Int, value: Int): Int {
        var i = index
        while (i <= endIndex) {
            if (preorder[i] > value)
                break
            i++
        }

        return i
    }
}