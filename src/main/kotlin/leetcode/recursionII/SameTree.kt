package leetcode.recursionII

import leetcode.binarytrees.TreeNode
import java.util.*

class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val r = LinkedList<List<TreeNode?>>()
        val s = LinkedList<List<TreeNode?>>()
        r.offer(listOf(p))
        s.offer(listOf(q))

        while (r.isNotEmpty() && s.isNotEmpty()) {
            val o1 = r.poll()
            val o2 = s.poll()

            if (o1.size != o2.size) return false

            val c1 = mutableListOf<TreeNode?>()
            val c2 = mutableListOf<TreeNode?>()


            for (i in o1.indices) {
                if (o1[i]?.`val` != o2[i]?.`val`) return false
                if (o1[i] != null || o2[i] != null) {
                    c1.add(o1[i]?.left)
                    c1.add(o1[i]?.right)
                    c2.add(o2[i]?.left)
                    c2.add(o2[i]?.right)
                }
            }
            if (c1.isNotEmpty()) r.offer(c1)
            if (c2.isNotEmpty()) s.offer(c2)
        }

        return true
    }
}
