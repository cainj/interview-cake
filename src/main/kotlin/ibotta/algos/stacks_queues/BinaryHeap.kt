package ibotta.algos.stacks_queues

/**
 * Is a Binary Tree that satisfies the following properties
 * 1. The tree must be complete, meaning the height of the subtrees cannot be >1
 * 2. The parent node must be greater than or equal to its children (max-heap)
 *    or less than or equal to its children (max-heap)
 *
 *  The tree structure is backed by an array, where the parent node is i, the left child 2i + 1, the right child 2i + 2
 *
 *           i <- parent
 *         /   \
 *        /    \
 *     2i + 1  2i + 2
 *
 *     Note: Root is the 0 index
 */
class BinaryHeap<T>(private val comparator: (T, T) -> Int) {

    private val storage = ArrayList<T>()

    //O(1)
    fun peek(): T? = storage.getOrNull(0)

    //O(log n)
    fun insert(value: T) {
        storage.add(value)
        var currentIndex = storage.size - 1

        while (currentIndex >= 0) {
            val parentIndex = (currentIndex - 1) / 2

            if (comparator(storage[currentIndex], storage[parentIndex]) > 0) {
                swap(currentIndex, parentIndex)
                currentIndex = parentIndex
            } else
                break
        }

    }

    //O(log n)
    fun delete(): T? {
        return storage.getOrNull(0).also {
            var currentIndex = 0
            val lastIndex = storage.size - 1
            swap(currentIndex, lastIndex)

            storage.removeAt(lastIndex)

            //if current node is a leaf stop
            while (storage.size != 0) {
                val l = storage.getOrNull(2 * currentIndex + 1)
                val r = storage.getOrNull(2 * currentIndex + 2)
                val currentNode = storage[currentIndex]

                val swapIndex = when {
                    l != null && r != null && comparator(l, currentNode) >= 0 && comparator(r, currentNode) >= 0 -> {
                        when {
                            comparator(l, r) >= 0 -> 2 * currentIndex + 1
                            else -> 2 * currentIndex + 2
                        }
                    }
                    l != null && comparator(l, currentNode) >= 0 -> 2 * currentIndex + 1
                    r != null && comparator(r, currentNode) >= 0 -> 2 * currentIndex + 2
                    else -> return@also
                }

                swap(swapIndex, currentIndex)
                currentIndex = swapIndex
            }
        }
    }

    fun isEmpty() = storage.size == 0

    fun swap(i: Int, j: Int) {
        val hold = storage[i]
        storage[i] = storage[j]
        storage[j] = hold
    }
}
