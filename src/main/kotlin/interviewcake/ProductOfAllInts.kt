package interviewcake

fun getProductsOfAllIntsExceptAtIndex2(numbers: IntArray): IntArray {
    require(numbers.size > 1)

    val products = IntArray(numbers.size) { 0 }
    val mid = numbers.size / 2
    val isOddSize = numbers.size % 2 == 1
    val fold = { array: List<Int> ->
        array.fold(1) { accum, next ->
            accum * next
        }
    }

    val left = fold(numbers.take(mid))
    val right = fold(numbers.takeLast(mid))

    for (i in numbers.indices) {
        val product =
            if (isOddSize && i == mid)
                left * right
            else if (i < mid)
                right * grab(numbers, 0, if (isOddSize) mid + 1 else mid, i)
            else
                left * grab(numbers, if (isOddSize) mid else mid, numbers.size, i)

        products[i] = product

    }

    return products
}

fun grab(numbers: IntArray, floor: Int, ceiling: Int, skipIndex: Int): Int {
    var product = 1
    for (i in floor until ceiling) {
        if (skipIndex != i)
            product *= numbers[i]
    }

    return product
}

fun getProductsOfAllIntsExceptAtIndex(intArray: IntArray): IntArray {

    require(intArray.size >= 2) { "Getting the product of numbers at other indices requires at least 2 numbers" }

    // we make an array with the length of the input array to
    // hold our products
    val productsOfAllIntsExceptAtIndex = IntArray(intArray.size)

    // for each integer, we find the product of all the integers
    // before it, storing the total product so far each time
    var productSoFar = 1
    for (i in intArray.indices) {
        productsOfAllIntsExceptAtIndex[i] = productSoFar
        productSoFar *= intArray[i]
    }

    // for each integer, we find the product of all the integers
    // after it. since each index in products already has the
    // product of all the integers before it, now we're storing
    // the total product of all other integers
    productSoFar = 1
    for (i in intArray.indices.reversed()) {
        productsOfAllIntsExceptAtIndex[i] *= productSoFar
        productSoFar *= intArray[i]
    }

    return productsOfAllIntsExceptAtIndex
}
