package interviewcake

import utils.swap

fun reverseString(chars: CharArray): CharArray {
    var beginIndex = 0
    var lastIndex = chars.size - 1
    while(beginIndex < lastIndex){
        swap(beginIndex, lastIndex, chars)
        beginIndex++
        lastIndex--
    }

    return chars
}


@ExperimentalStdlibApi
fun main() {
    assert(reverseString("hell".toCharArray()).concatToString() == "lleh")
}