package interviewcake

fun getProductsOfAllIntsExceptAtIndex(array: IntArray): IntArray {
    val products = IntArray(array.size) { 0 }
    require(array.size > 1)

    return products
}

private fun findProduct(minIndex: Int, array: IntArray): Int = array.foldIndexed(1) { index, accum, next ->
    if (index == minIndex) accum
    else accum * next
}