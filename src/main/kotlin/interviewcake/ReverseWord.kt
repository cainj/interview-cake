package interviewcake

import utils.swap

fun reverseWords(actual: CharArray) {
    reverseString(actual)
    var start = 0
    for (i in actual.indices) {
        when {
            actual[i] == ' ' -> {
                partitionReverse(start, i - 1, actual)
                start = i + 1
            }
            i == actual.size - 1 -> partitionReverse(start, i, actual)
        }
    }
}

fun partitionReverse(beginIndex: Int, lastIndex: Int, actual: CharArray) {
    var i = beginIndex
    var j = lastIndex
    while (i < j) {
        swap(i, j, actual)
        i++
        j--
    }
}
