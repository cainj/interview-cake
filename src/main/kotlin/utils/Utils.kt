package utils

fun <T> swap(i: Int, j: Int, array: Array<T>) {
    val hold = array[i]
    array[i] = array[j]
    array[j] = hold
}

fun swap(i: Int, j: Int, array: CharArray) {
    val hold = array[i]
    array[i] = array[j]
    array[j] = hold
}
