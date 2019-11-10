package interviewcake

import java.util.*

data class PositionChar(val index: Int, val c: Char)

fun getClosingParen(sentence: String, openingParenIndex: Int): Int {

    // find the position of the matching closing parenthesis
    //turn the array into a char array
    //loop thru the char pushing each '(' in the array onto the stack
    //when you reach a ')' pop the stack and check if the openingParenIndex has been reached
    //if it has then get the current index of the array and return if not then continue until you reach the end of the
    //array

    var openParenCount = 0
    val chars = sentence.toCharArray()

    if (chars[openingParenIndex] != '(') throw Exception("Not a valid position")

    for (i in openingParenIndex + 1 until chars.size) {
        when (chars[i]) {
            ')' ->
                if (openParenCount == 0)
                    return i
                else
                    openParenCount--

            '(' -> openParenCount++
        }
    }

    throw Exception("No matching closer")
}

fun getClosingParenWithStack(sentence: String, openingParenIndex: Int): Int {

    val stack = ArrayDeque<PositionChar>()
    val chars = sentence.toCharArray()

    for (i in chars.indices) {
        when (chars[i]) {
            ')' -> {
                val popped = stack.pop()
                if (popped.index == openingParenIndex)
                    return i
            }
            '(' -> {
                stack.push(PositionChar(i, chars[i]))
            }
        }
    }

    throw Exception("No matching closer")
}
