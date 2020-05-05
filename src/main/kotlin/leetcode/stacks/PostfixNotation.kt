package leetcode.stacks

import java.util.*

class PostfixNotation {

    private val stack = LinkedList<Int>()
    private val operators = hashMapOf<String, (Int, Int) -> Int>(
        "+" to fun(x: Int, y: Int): Int = x + y,
        "-" to fun(x: Int, y: Int): Int = y - x,
        "*" to fun(x: Int, y: Int): Int = x * y,
        "/" to fun(x: Int, y: Int): Int = y / x
    )

    fun evalRPN(tokens: Array<String>): Int {

        for (token in tokens) {
            if (!operators.contains(token))
                stack.push(token.toInt())
            else
                stack.push(operators[token]?.invoke(stack.pop(), stack.pop()))
        }

        return stack.pop()
    }
}
