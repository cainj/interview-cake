package leetcode.bst

class KthLargest(val k: Int, nums: IntArray) {

    data class MyTreeNode(
        val value: Int,
        var left: MyTreeNode? = null,
        var right: MyTreeNode? = null,
        var count: Int = 1
    )

    private var root: MyTreeNode? = buildTree(nums)

    fun add(`val`: Int): Int {
        root = insert(root, `val`)
        return findKthLargest(root, k) ?: 0
    }

    private fun findKthLargest(root: MyTreeNode?, k: Int): Int? {
        var m = 0
        if (root?.right != null) m += root.right!!.count

        return when {
            k == m + 1 -> root?.value
            k <= m -> findKthLargest(root?.right, k)
            else -> findKthLargest(root?.left, k - m - 1)
        }
    }

    private fun insert(node: MyTreeNode?, value: Int): MyTreeNode? {
        if (node == null) return MyTreeNode(value)
        if (value > node.value) node.right = insert(node.right, value)
        else node.left = insert(node.left, value)

        node.count++
        return node
    }

    private fun buildTree(nums: IntArray): MyTreeNode? {
        var node: MyTreeNode? = null
        for (element in nums)
            node = insert(node, element)

        return node
    }

}
