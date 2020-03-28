package ibotta.algos.collections

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryHeapTest {

    @Test
    fun basicOperations() {

        val binaryHeap = BinaryHeap { x: Int, y: Int ->
            when {
                x > y -> 1
                x == y -> 0
                else -> -1
            }
        }

        binaryHeap.insert(73)
        binaryHeap.insert(19)
        binaryHeap.insert(35)
        binaryHeap.insert(12)
        binaryHeap.insert(4)
        binaryHeap.insert(100)
        binaryHeap.insert(38)
        binaryHeap.insert(40)
        binaryHeap.insert(77)
        binaryHeap.insert(77)
        Assertions.assertEquals(100, binaryHeap.peek())

        val list = mutableListOf<Int>()

        while (!binaryHeap.isEmpty())
            list.add(binaryHeap.delete()!!)

        Assertions.assertEquals(mutableListOf(100, 77, 77, 73, 40, 38, 35, 19, 12, 4), list)
        Assertions.assertEquals(true, binaryHeap.isEmpty())
        Assertions.assertThrows(IndexOutOfBoundsException::class.java) { binaryHeap.delete() }
        Assertions.assertEquals(null, binaryHeap.peek())
    }
}
