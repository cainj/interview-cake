package ibotta.algos.graph

import java.util.*


/**
 * Date 04/06/2013
 * @author Tushar Roy
 *
 * Data structure to support following operations
 * extracMin - O(logn)
 * addToHeap - O(logn)
 * containsKey - O(1)
 * decreaseKey - O(logn)
 * getKeyWeight - O(1)
 *
 * It is a combination of binary heap and hash map
 */
class BinaryMinHeap<T> {
    private val allNodes: MutableList<Node> = ArrayList()
    private val nodePosition: MutableMap<T, Int?> = HashMap()

    inner class Node(var weight: Int, var key: T)

    /**
     * Checks where the key exists in heap or not
     */
    fun containsData(key: T): Boolean {
        return nodePosition.containsKey(key)
    }

    /**
     * Add key and its weight to they heap
     */
    fun add(weight: Int, key: T) {
        val node = Node(weight, key)

        allNodes.add(node)
        val size = allNodes.size
        var current = size - 1
        var parentIndex = (current - 1) / 2
        nodePosition[node.key] = current
        while (parentIndex >= 0) {
            val parentNode = allNodes[parentIndex]
            val currentNode = allNodes[current]
            if (parentNode.weight > currentNode.weight) {
                swap(parentNode, currentNode)
                updatePositionMap(parentNode.key, currentNode.key, parentIndex, current)
                current = parentIndex
                parentIndex = (parentIndex - 1) / 2
            } else {
                break
            }
        }
    }

    /**
     * Get the heap min without extracting the key
     */
    fun min(): T {
        return allNodes[0].key
    }

    /**
     * Checks with heap is empty or not
     */
    fun empty(): Boolean {
        return allNodes.size == 0
    }

    /**
     * Decreases the weight of given key to newWeight
     */
    fun decrease(data: T, newWeight: Int) {
        var position = nodePosition[data]
        allNodes[position!!].weight = newWeight
        var parent = (position - 1) / 2
        while (parent >= 0) {
            if (allNodes[parent].weight > allNodes[position!!].weight) {
                swap(allNodes[parent], allNodes[position])
                updatePositionMap(allNodes[parent].key, allNodes[position].key, parent, position)
                position = parent
                parent = (parent - 1) / 2
            } else {
                break
            }
        }
    }

    /**
     * Get the weight of given key
     */
    fun getWeight(key: T): Int? {
        val position = nodePosition[key]
        return if (position == null) {
            null
        } else {
            allNodes[position].weight
        }
    }

    /**
     * Returns the min node of the heap
     */
    fun extractMinNode(): Node {
        var size = allNodes.size - 1
        val minNode = Node(allNodes[0].weight, allNodes[0].key)
        val lastNodeWeight = allNodes[size].weight
        allNodes[0].weight = lastNodeWeight
        allNodes[0].key = allNodes[size].key
        nodePosition.remove(minNode.key)
        nodePosition.remove(allNodes[0].key)
        nodePosition[allNodes[0].key] = 0
        allNodes.removeAt(size)
        var currentIndex = 0
        size--
        while (true) {
            val left = 2 * currentIndex + 1
            var right = 2 * currentIndex + 2
            if (left > size) {
                break
            }
            if (right > size) {
                right = left
            }
            val smallerIndex = if (allNodes[left].weight <= allNodes[right].weight) left else right
            currentIndex = if (allNodes[currentIndex].weight > allNodes[smallerIndex].weight) {
                swap(allNodes[currentIndex], allNodes[smallerIndex])
                updatePositionMap(
                    allNodes[currentIndex].key,
                    allNodes[smallerIndex].key,
                    currentIndex,
                    smallerIndex
                )
                smallerIndex
            } else {
                break
            }
        }
        return minNode
    }

    /**
     * Extract min value key from the heap
     */
    fun extractMin(): T {
        val node = extractMinNode()
        return node.key
    }

    private fun printPositionMap() {
        println(nodePosition)
    }

    private fun swap(node1: Node, node2: Node) {
        val weight = node1.weight
        val data: T = node1.key
        node1.key = node2.key
        node1.weight = node2.weight
        node2.key = data
        node2.weight = weight
    }

    private fun updatePositionMap(data1: T, data2: T, pos1: Int, pos2: Int) {
        nodePosition.remove(data1)
        nodePosition.remove(data2)
        nodePosition[data1] = pos1
        nodePosition[data2] = pos2
    }

    fun printHeap() {
        for (n in allNodes) {
            println(n.weight.toString() + " " + n.key)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val heap = BinaryMinHeap<String>()
            heap.add(3, "Tushar")
            heap.add(4, "Ani")
            heap.add(8, "Vijay")
            heap.add(10, "Pramila")
            heap.add(5, "Roy")
            heap.add(6, "NTF")
            heap.add(2, "AFR")
            heap.decrease("Pramila", 1)
            heap.printHeap()
            heap.printPositionMap()
        }
    }
}
