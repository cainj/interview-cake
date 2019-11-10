package interviewcake

fun binarySearchRecursive(target: Int, array: IntArray, floorIndex: Int, ceilingIndex: Int): Boolean {
    return when {
        array.isEmpty() -> false
        floorIndex + 1 >= ceilingIndex -> false
        else -> {
            val distance = ceilingIndex - floorIndex
            val halfDistance = distance / 2
            val guessIndex = floorIndex + halfDistance
            when {
                array[guessIndex] == target -> true
                array[guessIndex] < target -> binarySearchRecursive(target, array, guessIndex, ceilingIndex)
                else -> binarySearchRecursive(target, array, floorIndex, guessIndex)
            }
        }
    }
}

fun binarySearchIterative(target: Int, array: IntArray): Boolean {

    if (array.isEmpty())
        return false
    var floorIndex = -1
    var ceilingIndex = array.size

    while (floorIndex + 1 < ceilingIndex) {
        val distance = ceilingIndex - floorIndex
        val halfDistance = distance / 2
        val guessIndex = floorIndex + halfDistance

        when {
            array[guessIndex] == target -> return true
            array[guessIndex] < target -> floorIndex = guessIndex
            else -> ceilingIndex = guessIndex
        }
    }
    return false
}

fun main() {
    val search = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20)
    val shuffled = intArrayOf(1, 2, 4, 6, 20, 11)
    shuffled.forEach {
        val found = binarySearchRecursive(it, search, -1 , search.size)
        //val found = binarySearchIterative(it, search, -1 , search.size)
        println("Searching '$it', found: $found.")
    }
}
