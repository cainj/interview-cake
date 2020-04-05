package utils

fun <T> Array<T>.swap(i: Int, j: Int) {
    val hold = this[i]
    this[i] = this[j]
    this[j] = hold
}

fun CharArray.swap(i: Int, j: Int) {
    val hold = this[i]
    this[i] = this[j]
    this[j] = hold
}
