package interviewcake


fun mergeArrays(left: IntArray, right: IntArray): IntArray {
    val mergedArray = IntArray(left.size + right.size)
    recursiveMerge(left, right, mergedArray, 0, 0, 0)
    return mergedArray
}

fun recursiveMerge(left: IntArray, right: IntArray, arr: IntArray, index: Int, leftIndex: Int, rightIndex: Int) {
    when {
        leftIndex >= left.size -> right.copyInto(arr, index, rightIndex, right.size)
        rightIndex >= right.size -> left.copyInto(arr, index, leftIndex, left.size)
        left[leftIndex] < right[rightIndex] -> {
            arr[index] = left[leftIndex]
            recursiveMerge(left, right, arr, index + 1, leftIndex + 1, rightIndex)
        }
        left[leftIndex] > right[rightIndex] -> {
            arr[index] = right[rightIndex]
            recursiveMerge(left, right, arr, index + 1, leftIndex, rightIndex + 1)
        }
    }
}
