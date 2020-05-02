package leetcode.queues

import java.util.*


class OpenLock {

    fun openLock(deadends: Array<String?>, target: String): Int {
        val queue = LinkedList<String?>()
        queue.offer("0000")
        queue.offer(null)
        val seen = HashSet<String?>()
        seen.add("0000")
        var depth = 0
        while (!queue.isEmpty()) {
            val node = queue.poll()
            if (node == null) {
                depth++
                if (queue.peek() != null) queue.offer(null)
            } else if (node == target)
                return depth
            else if (!deadends.contains(node)) {
                for (i in 0..3) {
                    var d = -1
                    while (d <= 1) {
                        val y = (node[i] - '0' + d + 10) % 10
                        val nei = node.substring(0, i) + ("" + y) + node.substring(i + 1)
                        if (!seen.contains(nei)) {
                            seen.add(nei)
                            queue.offer(nei)
                        }
                        d += 2
                    }
                }
            }
        }
        return -1
    }
}
