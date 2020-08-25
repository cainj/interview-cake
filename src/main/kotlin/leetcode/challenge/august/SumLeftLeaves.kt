package leetcode.challenge.august

import leetcode.binarytrees.TreeNode
import java.util.*

class SumLeftLeaves {

    fun sumOfLeftLeaves(root: TreeNode?,isLeft:Boolean = false): Int {
        if(root == null) return 0
        if (root.left == null && root.right == null){
            return if(isLeft) root.`val` else 0
        }
        return sumOfLeftLeaves(root.left,true) + sumOfLeftLeaves(root.right,false)
    }

    private var sum = 0
    fun sumOfLeftLeavesDFS(root: TreeNode?): Int {
        if (root == null) return 0

        if (root.left != null && root.left?.left == null && root.left?.right == null) sum += root.left!!.`val`

        sumOfLeftLeaves(root.left)
        sumOfLeftLeaves(root.right)
        return sum
    }
}
